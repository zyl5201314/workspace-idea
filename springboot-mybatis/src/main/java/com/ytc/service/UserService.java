/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: UserService
 * Author:   zyl
 * Date:     2020/8/14 11:32
 * History:
 */
package com.ytc.service;

import com.ytc.model.User;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zyl
 * @create 2020/8/14
 * @since 1.0.0
 */
public interface UserService {
    List<User> queryUserList();

    void addUser(User user);
}
