/**
 * Copyright (C), 2019, 因特驰
 * FileName: UserServiceImpl
 * Author:   zyl
 * Date:     2020/8/17 10:24
 * History:
 * zyl          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.service;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zyl
 * @create 2020/8/17
 * @since 1.0.0
 */
public class UserServiceImpl implements UserService {

    @Override
    public void hello(String name, String age) {
        System.out.println("姓名："+name+",年龄:"+age);
    }

    @Override
    public String sayHello(String name, String hobby) {
        System.out.println("姓名："+name+",爱好："+hobby);
        return "姓名："+name+",爱好："+hobby;
    }
}
