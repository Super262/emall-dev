package com.fengwei.service.impl;

import com.fengwei.enums.ProductStatusEnum;
import com.fengwei.enums.ResponseEnum;
import com.fengwei.forms.CartAddForm;
import com.fengwei.forms.CartUpdateForm;
import com.fengwei.pojo.CartItem;
import com.fengwei.pojo.Product;
import com.fengwei.pojo.vo.CartProductVo;
import com.fengwei.pojo.vo.CartVo;
import com.fengwei.pojo.vo.ResponseVo;
import com.fengwei.service.ICartService;
import com.fengwei.service.IProductMapperService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class CartServiceImpl implements ICartService {

    private final static String CART_REDIS_KEY_TEMPLATE = "cart_%d";

    @Autowired
    private IProductMapperService productMapper;

    @Autowired
    private StringRedisTemplate redisTemplate;

    private final Gson gson = new Gson();

    @Override
    public ResponseVo<CartVo> addItem(Integer uid,CartAddForm form) {
        Integer quantity = 1;

        Product product = productMapper.selectByPrimaryKey(form.getProductId());

        //商品是否存在
        if (product == null) {
            return ResponseVo.error(ResponseEnum.PRODUCT_NOT_EXIST);
        }

        //商品是否正常在售
        if (!product.getStatus().equals(ProductStatusEnum.ON_SALE.getCode())) {
            return ResponseVo.error(ResponseEnum.PRODUCT_OFF_SALE_OR_DELETE);
        }

        //商品库存是否充足
        if (product.getStock() <= 0) {
            return ResponseVo.error(ResponseEnum.PROODUCT_STOCK_ERROR);
        }

        //写入到redis
        //key: cart_1
        HashOperations<String, String, String> opsForHash = redisTemplate.opsForHash();
        String redisKey = String.format(CART_REDIS_KEY_TEMPLATE,uid);

        CartItem cartItem;
        String value = opsForHash.get(redisKey,String.valueOf(product.getId()));
        if (StringUtils.isEmpty(value)) {
            //没有该商品, 新增
            cartItem = new CartItem(product.getId(),quantity,form.getSelected());
        } else {
            //已经有了，数量+1
            cartItem = gson.fromJson(value,CartItem.class);
            cartItem.setQuantity(cartItem.getQuantity() + quantity);
        }

        opsForHash.put(redisKey,String.valueOf(product.getId()),gson.toJson(cartItem));

        return getListOfItems(uid);
    }

    @Override
    public ResponseVo<CartVo> getListOfItems(Integer uid) {
        HashOperations<String, String, String> opsForHash = redisTemplate.opsForHash();
        String redisKey = String.format(CART_REDIS_KEY_TEMPLATE,uid);
        Map<String, String> entries = opsForHash.entries(redisKey);

        boolean selectAll = true;
        Integer cartTotalQuantity = 0;
        BigDecimal cartTotalPrice = BigDecimal.ZERO;
        CartVo cartVo = new CartVo();
        List<CartProductVo> cartProductVoList = new ArrayList<>();
        for (Map.Entry<String, String> entry : entries.entrySet()) {
            String productId = entry.getKey();
            CartItem cartItem = gson.fromJson(entry.getValue(),CartItem.class);

            //TODO 需要优化，使用mysql里的in
            Product product = productMapper.selectByPrimaryKey(productId);
            if (product != null) {
                CartProductVo cartProductVo = new CartProductVo(productId,cartItem.getQuantity(),product.getName(),product.getSubtitle(),product.getMainImage(),product.getPrice(),product.getStatus(),product.getPrice().multiply(BigDecimal.valueOf(cartItem.getQuantity())),product.getStock(),cartItem.getProductSelected());
                cartProductVoList.add(cartProductVo);

                if (!cartItem.getProductSelected()) {
                    selectAll = false;
                }

                //计算总价(只计算选中的)
                if (cartItem.getProductSelected()) {
                    cartTotalPrice = cartTotalPrice.add(cartProductVo.getProductTotalPrice());
                }
            }

            cartTotalQuantity += cartItem.getQuantity();
        }

        //有一个没有选中，就不叫全选
        cartVo.setSelectedAll(selectAll);
        cartVo.setCartTotalQuantity(cartTotalQuantity);
        cartVo.setCartTotalPrice(cartTotalPrice);
        cartVo.setCartProductVoList(cartProductVoList);
        return ResponseVo.success(cartVo);
    }

    @Override
    public ResponseVo<CartVo> updateItem(Integer uid,String productId,CartUpdateForm form) {
        HashOperations<String, String, String> opsForHash = redisTemplate.opsForHash();
        String redisKey = String.format(CART_REDIS_KEY_TEMPLATE,uid);

        String value = opsForHash.get(redisKey,String.valueOf(productId));
        if (StringUtils.isEmpty(value)) {
            //没有该商品, 报错
            return ResponseVo.error(ResponseEnum.CART_PRODUCT_NOT_EXIST);
        }

        //已经有了，修改内容
        CartItem cartItem = gson.fromJson(value,CartItem.class);
        if (form.getQuantity() != null && form.getQuantity() >= 0) {
            cartItem.setQuantity(form.getQuantity());
        }
        if (form.getSelected() != null) {
            cartItem.setProductSelected(form.getSelected());
        }

        opsForHash.put(redisKey,String.valueOf(productId),gson.toJson(cartItem));
        return getListOfItems(uid);
    }

    @Override
    public ResponseVo<CartVo> deleteItem(Integer uid,String productId) {
        HashOperations<String, String, String> opsForHash = redisTemplate.opsForHash();
        String redisKey = String.format(CART_REDIS_KEY_TEMPLATE,uid);
        String value = opsForHash.get(redisKey,String.valueOf(productId));
        if (StringUtils.isEmpty(value)) {
            //没有该商品, 报错
            return ResponseVo.error(ResponseEnum.CART_PRODUCT_NOT_EXIST);
        }
        opsForHash.delete(redisKey,String.valueOf(productId));
        return getListOfItems(uid);
    }

    @Override
    public ResponseVo<CartVo> setAllSelected(Integer uid) {
        HashOperations<String, String, String> opsForHash = redisTemplate.opsForHash();
        String redisKey = String.format(CART_REDIS_KEY_TEMPLATE,uid);
        for (CartItem cartItem : getCartOfUser(uid)) {
            cartItem.setProductSelected(true);
            opsForHash.put(redisKey,String.valueOf(cartItem.getProductId()),gson.toJson(cartItem));
        }
        return getListOfItems(uid);
    }

    @Override
    public ResponseVo<CartVo> setAllUnselected(Integer uid) {
        HashOperations<String, String, String> opsForHash = redisTemplate.opsForHash();
        String redisKey = String.format(CART_REDIS_KEY_TEMPLATE,uid);
        for (CartItem cartItem : getCartOfUser(uid)) {
            cartItem.setProductSelected(false);
            opsForHash.put(redisKey,String.valueOf(cartItem.getProductId()),gson.toJson(cartItem));
        }
        return getListOfItems(uid);
    }

    @Override
    public ResponseVo<Integer> getTotalQuantity(Integer uid) {
        Integer sum = getCartOfUser(uid).stream().map(CartItem::getQuantity).reduce(0,Integer::sum);
        return ResponseVo.success(sum);
    }

    @Override
    public List<CartItem> getCartOfUser(Integer uid) {
        HashOperations<String, String, String> opsForHash = redisTemplate.opsForHash();
        String redisKey = String.format(CART_REDIS_KEY_TEMPLATE,uid);
        Map<String, String> entries = opsForHash.entries(redisKey);
        List<CartItem> cartItemList = new ArrayList<>();
        for (Map.Entry<String, String> entry : entries.entrySet()) {
            cartItemList.add(gson.fromJson(entry.getValue(),CartItem.class));
        }

        return cartItemList;
    }
}
