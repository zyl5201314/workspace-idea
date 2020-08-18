/**
 * Copyright (C), 2019, 因特驰
 * FileName: UserController
 * Author:   zyl
 * Date:     2020/8/14 9:40
 * History:
 * zyl          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.controller;

import com.ytc.dao.StuJpa;
import com.ytc.model.Student;
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
@RequestMapping("/user")
public class UserController {

    @Autowired
   private StuJpa stuJpa;


    @RequestMapping("addStu")
    public String addStu(){
        Student student=new Student();
        student.setStuage(20);
        student.setStuname("李四");
        stuJpa.save(student);
        return "index";
    }

    @RequestMapping("queryStu")
    public String queryStu(Model model){

        List<Student> all = stuJpa.findAll();
        model.addAttribute("list",all);
        return "list";
    }

    @RequestMapping("delstu")
    public String delstu(Integer stuid){
        stuJpa.deleteById(stuid);
        return "redirect:queryStu";
    }

    @RequestMapping("toupdatestu")
    public String toupdatestu(Integer stuid,Model model){
       Student stu = stuJpa.getOne(stuid);
        model.addAttribute("stu",stu);
        return "update";
    }

    @RequestMapping("update")
    public String update(Student student){

        stuJpa.save(student);
        return "redirect:queryStu";
    }

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }

    @RequestMapping("index")
    public String index(){
        return "index";
    }
}
