/**
 * Copyright (C), 2019, 因特驰
 * FileName: UserController
 * Author:   zyl
 * Date:     2020/8/17 11:29
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

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zyl
 * @create 2020/8/17
 * @since 1.0.0
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("queryUserList")
    public String queryUserList(Model model){
        List<User> users = userService.queryUserLit();
        model.addAttribute("list",users);
        return "list";
    }
}
