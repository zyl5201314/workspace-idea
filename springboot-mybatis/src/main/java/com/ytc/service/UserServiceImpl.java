/**
 * Copyright (C), 2019, 因特驰
 * FileName: UserServiceImpl
 * Author:   zyl
 * Date:     2020/8/14 11:32
 * History:
 * zyl          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.service;

import com.ytc.dao.UserMapper;
import com.ytc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zyl
 * @create 2020/8/14
 * @since 1.0.0
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
   // @Transactional(readOnly = true)
    public List<User> queryUserList() {
        return userMapper.queryUserList();
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
      //  int i = 1/0;
    }
}
