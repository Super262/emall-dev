package com.fengwei.service.impl;

import com.fengwei.enums.OrderStatusEnum;
import com.fengwei.enums.PaymentTypeEnum;
import com.fengwei.enums.ProductStatusEnum;
import com.fengwei.enums.ResponseEnum;
import com.fengwei.mapper.UserOrderItemMapper;
import com.fengwei.mapper.UserOrderMapper;
import com.fengwei.mapper.UserShippingMapper;
import com.fengwei.pojo.*;
import com.fengwei.pojo.vo.OrderItemVo;
import com.fengwei.pojo.vo.OrderVo;
import com.fengwei.pojo.vo.ResponseVo;
import com.fengwei.service.ICartService;
import com.fengwei.service.IOrderService;
import com.fengwei.service.IProductMapperService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private UserShippingMapper shippingMapper;

    @Autowired
    private ICartService cartService;

    @Autowired
    private IProductMapperService productMapper;

    @Autowired
    private UserOrderMapper orderMapper;

    @Autowired
    private UserOrderItemMapper orderItemMapper;

    @Override
    @Transactional
    public ResponseVo<OrderVo> createOrder(Integer uid,Integer shippingId) {
        //收货地址校验（总之要查出来的）
        UserShipping shipping = shippingMapper.selectByUidAndShippingId(uid,shippingId);
        if (shipping == null) {
            return ResponseVo.error(ResponseEnum.SHIPPING_NOT_EXIST);
        }

        //获取购物车，校验（是否有商品、库存）
        List<CartItem> cartItemList = cartService.getCartOfUser(uid).stream().filter(CartItem::getProductSelected).collect(Collectors.toList());
        if (CollectionUtils.isEmpty(cartItemList)) {
            return ResponseVo.error(ResponseEnum.CART_SELECTED_IS_EMPTY);
        }

        //获取cartList里的productIds
        Set<String> productIdSet = cartItemList.stream().map(CartItem::getProductId).collect(Collectors.toSet());
        List<Product> productList = productMapper.selectByProductIdSet(productIdSet);
        Map<String, Product> map = productList.stream().collect(Collectors.toMap(Product::getId,product -> product));

        List<UserOrderItem> orderItemList = new ArrayList<>();
        Long orderNo = generateOrderNo();
        for (CartItem cartItem : cartItemList) {
            //根据productId查数据库
            Product product = map.get(cartItem.getProductId());
            //是否有商品
            if (product == null) {
                return ResponseVo.error(ResponseEnum.PRODUCT_NOT_EXIST,"商品不存在. productId = " + cartItem.getProductId());
            }
            //商品上下架状态
            if (!ProductStatusEnum.ON_SALE.getCode().equals(product.getStatus())) {
                return ResponseVo.error(ResponseEnum.PRODUCT_OFF_SALE_OR_DELETE,"商品不是在售状态. " + product.getName());
            }

            //库存是否充足
            if (product.getStock() < cartItem.getQuantity()) {
                return ResponseVo.error(ResponseEnum.PROODUCT_STOCK_ERROR,"库存不正确. " + product.getName());
            }

            UserOrderItem orderItem = buildOrderItem(uid,orderNo,cartItem.getQuantity(),product);
            orderItemList.add(orderItem);

            //减库存
            product.setStock(product.getStock() - cartItem.getQuantity());
            int row = productMapper.updateByPrimaryKeySelective(product);
            if (row <= 0) {
                return ResponseVo.error(ResponseEnum.ERROR);
            }
        }

        //计算总价，只计算选中的商品
        //生成订单，入库：order和order_item，事务
        UserOrder order = buildOrder(uid,orderNo,shippingId,orderItemList);

        int rowForOrder = orderMapper.insertSelective(order);
        if (rowForOrder <= 0) {
            return ResponseVo.error(ResponseEnum.ERROR);
        }

        int rowForOrderItem = orderItemMapper.insertList(orderItemList);
        if (rowForOrderItem <= 0) {
            return ResponseVo.error(ResponseEnum.ERROR);
        }

        //更新购物车（选中的商品）
        //Redis有事务(打包命令)，不能回滚
        for (CartItem cartItem : cartItemList) {
            cartService.deleteItem(uid,cartItem.getProductId());
        }

        //构造orderVo
        OrderVo orderVo = buildOrderVo(order,orderItemList,shipping);
        return ResponseVo.success(orderVo);
    }

    @Override
    public ResponseVo<PageInfo> getListOfOrders(Integer uid,Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<UserOrder> orderList = orderMapper.selectByUid(uid);

        Set<Long> orderNoSet = orderList.stream().map(UserOrder::getOrderNo).collect(Collectors.toSet());
        List<UserOrderItem> orderItemList = orderItemMapper.selectByOrderNoSet(orderNoSet);
        Map<Long, List<UserOrderItem>> orderItemMap = orderItemList.stream().collect(Collectors.groupingBy(UserOrderItem::getOrderNo));

        Set<Integer> shippingIdSet = orderList.stream().map(UserOrder::getShippingId).collect(Collectors.toSet());
        List<UserShipping> shippingList = shippingMapper.selectByIdSet(shippingIdSet);
        Map<Integer, UserShipping> shippingMap = shippingList.stream().collect(Collectors.toMap(UserShipping::getId,shipping -> shipping));

        List<OrderVo> orderVoList = new ArrayList<>();
        for (UserOrder order : orderList) {
            OrderVo orderVo = buildOrderVo(order,orderItemMap.get(order.getOrderNo()),shippingMap.get(order.getShippingId()));
            orderVoList.add(orderVo);
        }
        PageInfo pageInfo = new PageInfo<>(orderList);
        pageInfo.setList(orderVoList);
        pageInfo.setPages(orderVoList.size());
        return ResponseVo.success(pageInfo);
    }

    @Override
    public ResponseVo<OrderVo> getDetailOfOrder(Integer uid,Long orderNo) {
        UserOrder order = orderMapper.selectByOrderNo(orderNo);
        if (order == null || !order.getUserId().equals(uid)) {
            return ResponseVo.error(ResponseEnum.ORDER_NOT_EXIST);
        }
        Set<Long> orderNoSet = new HashSet<>();
        orderNoSet.add(order.getOrderNo());
        List<UserOrderItem> orderItemList = orderItemMapper.selectByOrderNoSet(orderNoSet);

        UserShipping shipping = shippingMapper.selectByPrimaryKey(order.getShippingId());

        OrderVo orderVo = buildOrderVo(order,orderItemList,shipping);
        return ResponseVo.success(orderVo);
    }

    @Override
    public ResponseVo cancelOrder(Integer uid,Long orderNo) {
        UserOrder order = orderMapper.selectByOrderNo(orderNo);
        if (order == null || !order.getUserId().equals(uid)) {
            return ResponseVo.error(ResponseEnum.ORDER_NOT_EXIST);
        }
        //只有[未付款]订单可以取消，看自己公司业务
        if (!order.getStatus().equals(OrderStatusEnum.NO_PAY.getCode())) {
            return ResponseVo.error(ResponseEnum.ORDER_STATUS_ERROR);
        }

        order.setStatus(OrderStatusEnum.CANCELED.getCode());
        order.setClosedTime(new Date());
        int row = orderMapper.updateByPrimaryKeySelective(order);
        if (row <= 0) {
            return ResponseVo.error(ResponseEnum.ERROR);
        }

        return ResponseVo.success();
    }

    @Override
    public void setStatusPaid(Long orderNo) {
        UserOrder order = orderMapper.selectByOrderNo(orderNo);
        if (order == null) {
            throw new RuntimeException(ResponseEnum.ORDER_NOT_EXIST.getDesc() + "订单id:" + orderNo);
        }
        //只有[未付款]订单可以变成[已付款]，看自己公司业务
        if (!order.getStatus().equals(OrderStatusEnum.NO_PAY.getCode())) {
            throw new RuntimeException(ResponseEnum.ORDER_STATUS_ERROR.getDesc() + "订单id:" + orderNo);
        }

        order.setStatus(OrderStatusEnum.PAID.getCode());
        order.setPaidTime(new Date());
        int row = orderMapper.updateByPrimaryKeySelective(order);
        if (row <= 0) {
            throw new RuntimeException("将订单更新为已支付状态失败，订单id:" + orderNo);
        }
    }

    private OrderVo buildOrderVo(UserOrder order,List<UserOrderItem> orderItemList,UserShipping shipping) {
        OrderVo orderVo = new OrderVo();
        BeanUtils.copyProperties(order,orderVo);

        List<OrderItemVo> OrderItemVoList = orderItemList.stream().map(e -> {
            OrderItemVo orderItemVo = new OrderItemVo();
            BeanUtils.copyProperties(e,orderItemVo);
            return orderItemVo;
        }).collect(Collectors.toList());
        orderVo.setOrderItemVoList(OrderItemVoList);

        if (shipping != null) {
            orderVo.setShippingId(shipping.getId());
            orderVo.setShippingVo(shipping);
        }

        return orderVo;
    }

    private UserOrder buildOrder(Integer uid,Long orderNo,Integer shippingId,List<UserOrderItem> orderItemList) {
        BigDecimal paymentAmount = orderItemList.stream().map(UserOrderItem::getTotalPrice).reduce(BigDecimal.ZERO,BigDecimal::add);
        UserOrder order = new UserOrder();
        order.setOrderNo(orderNo);
        order.setUserId(uid);
        order.setShippingId(shippingId);
        order.setPaymentAmount(paymentAmount);
        order.setPaymentType(PaymentTypeEnum.PAY_ONLINE.getCode());
        order.setPostage(0);
        order.setStatus(OrderStatusEnum.NO_PAY.getCode());
        return order;
    }

    /**
     * 企业级：分布式唯一id/主键
     */
    private Long generateOrderNo() {
        return System.currentTimeMillis() + new Random().nextInt(999);
    }

    private UserOrderItem buildOrderItem(Integer uid,Long orderNo,Integer quantity,Product product) {
        UserOrderItem item = new UserOrderItem();
        item.setUserId(uid);
        item.setOrderNo(orderNo);
        item.setProductId(product.getId());
        item.setProductName(product.getName());
        item.setProductImage(product.getMainImage());
        item.setCurrentUnitPrice(product.getPrice());
        item.setQuantity(quantity);
        item.setTotalPrice(product.getPrice().multiply(BigDecimal.valueOf(quantity)));
        return item;
    }
}
