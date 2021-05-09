package com.fengwei.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "mall_user")
public class MallUser {
    /**
     * 用户表id
     */
    @Id
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码，MD5加密
     */
    private String password;

    private String email;

    private String phone;

    /**
     * 找回密码问题
     */
    private String question;

    /**
     * 找回密码答案
     */
    private String answer;

    /**
     * 角色0-管理员,1-普通用户
     */
    private Integer role;

    /**
     * 创建时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * 最后一次更新时间
     */
    @Column(name = "updated_time")
    private Date updatedTime;

    /**
     * 获取用户表id
     *
     * @return id - 用户表id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置用户表id
     *
     * @param id 用户表id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取用户密码，MD5加密
     *
     * @return password - 用户密码，MD5加密
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置用户密码，MD5加密
     *
     * @param password 用户密码，MD5加密
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取找回密码问题
     *
     * @return question - 找回密码问题
     */
    public String getQuestion() {
        return question;
    }

    /**
     * 设置找回密码问题
     *
     * @param question 找回密码问题
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * 获取找回密码答案
     *
     * @return answer - 找回密码答案
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * 设置找回密码答案
     *
     * @param answer 找回密码答案
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    /**
     * 获取角色0-管理员,1-普通用户
     *
     * @return role - 角色0-管理员,1-普通用户
     */
    public Integer getRole() {
        return role;
    }

    /**
     * 设置角色0-管理员,1-普通用户
     *
     * @param role 角色0-管理员,1-普通用户
     */
    public void setRole(Integer role) {
        this.role = role;
    }

    /**
     * 获取创建时间
     *
     * @return created_time - 创建时间
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置创建时间
     *
     * @param createdTime 创建时间
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 获取最后一次更新时间
     *
     * @return updated_time - 最后一次更新时间
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 设置最后一次更新时间
     *
     * @param updatedTime 最后一次更新时间
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}