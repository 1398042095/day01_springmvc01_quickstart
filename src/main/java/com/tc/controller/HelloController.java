package com.tc.controller;


import com.tc.domain.Account;
import com.tc.domain.userDO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 */
@Controller
@RequestMapping("param")
public class HelloController {


    @RequestMapping("/hello")
    public String hello(){
        System.out.println("测试程序 hello springmvc");

        return  "success";
    }

    @RequestMapping("/hello2")
    public String hello2(String name){
        System.out.println(name+"=============");
        System.out.println("测试程序 hello springmvc");

        return  "success";
    }

    @RequestMapping("/hello3")
    public String hello3(Account account){

        System.out.println("测试程序 hello springmvc");
        System.out.println(account.toString());
        return  "success";
    }

    /***
     * 自定义类型转换器
     * @param userDO
     * @return
     */
    @RequestMapping("/saveUser")
    public String saveUser(userDO userDO){

        System.out.println("测试程序 hello springmvc");
       System.out.println(userDO.toString());
        return  "success";
    }


    /*sservlet 原生的api*/
    @RequestMapping("/servlet")
    public String servlet(HttpServletRequest request, HttpServletResponse response){
        System.out.println(request);
        System.out.println("测试程序 hello springmvc");
        HttpSession session = request.getSession();
        System.out.println(session);
        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext);

        return  "success";
    }
}
