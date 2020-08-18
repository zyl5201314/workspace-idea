/**
 * Copyright (C), 2019, 因特驰
 * FileName: UserController
 * Author:   zyl
 * Date:     2020/8/14 11:31
 * History:
 * zyl          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.controller;

import com.ytc.model.User;
import com.ytc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zyl
 * @create 2020/8/14
 * @since 1.0.0
 */
@Controller
public class UserController {

    @Autowired
    public UserService userService;

    @RequestMapping("queryUserList")
    public String queryUserList(Model model){
       List<User> list= userService.queryUserList();
        model.addAttribute("list",list);
       return "list";
    }

    @RequestMapping("toAdd")
    public String toAdd(){

        return "addUser";
    }

    @RequestMapping("addUser")
    @ResponseBody
    public void addUser(User user){
        userService.addUser( user);
    }

}
