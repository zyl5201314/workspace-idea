/**
 * Copyright (C), 2019, 因特驰
 * FileName: DemoController
 * Author:   zyl
 * Date:     2020/8/13 11:55
 * History:
 * zyl          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zyl
 * @create 2020/8/13
 * @since 1.0.0
 */
@Controller
@RequestMapping("/demo")
public class DemoController {


    @RequestMapping("hello")
    @ResponseBody
    public String hello() {
        return "hello SpringBoot";
    }

    @RequestMapping("index")
    public String toIndex(){
        return "index";
    }
}
