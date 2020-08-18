/**
 * Copyright (C), 2019, 因特驰
 * FileName: UserController
 * Author:   zyl
 * Date:     2020/8/17 12:14
 * History:
 * zyl          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ytc.model.User;
import com.ytc.service.UserService;
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

    @Reference(timeout = 60000,retries = 2,check = false,version = "1.0")
    private UserService userService;

    @RequestMapping("queryUserList")
    public String queryUserList(Model model){
        List<User> users = userService.queryUserLit();
        model.addAttribute("list",users);
        return "list";
    }
}
