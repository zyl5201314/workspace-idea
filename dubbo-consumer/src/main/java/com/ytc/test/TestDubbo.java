/**
 * Copyright (C), 2019, 因特驰
 * FileName: TestDubbo
 * Author:   zyl
 * Date:     2020/8/17 10:40
 * History:
 * zyl          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.test;

import com.ytc.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zyl
 * @create 2020/8/17
 * @since 1.0.0
 */
public class TestDubbo {


    public static void main(String[] args) {
        //这是加载我们 的配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-dubbo-consumer.xml");
        //获得接口对象
        UserService userService = (UserService) ac.getBean("userService");
        //调用userservice的方法
        for (int i=0;true;i++){
            userService.hello("张三","18");
            String str = userService.sayHello("李四", "游泳，健身");
            System.out.println(str);
        }

    }
}
