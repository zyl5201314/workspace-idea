package com.ytc.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
    /**
     * duboo中的实体类一定要实现序列化  因为我们传递参数时是通过二进制的流传递的  不序列化是没有办法把对象传过去的
     */
    private static final long serialVersionUID = 2541233165234473924L;

    private Integer userid;

    private String username;

    private String userpassword;

    private Date userbir;

    private Double userprice;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    public Date getUserbir() {
        return userbir;
    }

    public void setUserbir(Date userbir) {
        this.userbir = userbir;
    }

    public Double getUserprice() {
        return userprice;
    }

    public void setUserprice(Double userprice) {
        this.userprice = userprice;
    }
}