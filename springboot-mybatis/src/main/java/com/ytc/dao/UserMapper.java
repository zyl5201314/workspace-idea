package com.ytc.dao;

import com.ytc.model.User;

import java.util.List;

public interface UserMapper {


    List<User> queryUserList();

    void addUser(User user);
}