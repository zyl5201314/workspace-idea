/**
 * Copyright (C), 2019, 因特驰
 * FileName: UserServiceImpl
 * Author:   zyl
 * Date:     2020/8/17 11:43
 * History:
 * zyl          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.ytc.dao.UserMapper;
import com.ytc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zyl
 * @create 2020/8/17
 * @since 1.0.0
 */
@Component //把实现类注入到spring中交给spring管理  不区分你是那一层
@Service(version = "1.0")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> queryUserLit() {
        return userMapper.queryUserLit();
    }
}
