package com.ytc.model;

public class User {
    private Integer userid;

    private String username;

    private String userpassword;

    private String userbir;

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

    public String getUserbir() {
        return userbir;
    }

    public void setUserbir(String userbir) {
        this.userbir = userbir;
    }

    public Double getUserprice() {
        return userprice;
    }

    public void setUserprice(Double userprice) {
        this.userprice = userprice;
    }
}