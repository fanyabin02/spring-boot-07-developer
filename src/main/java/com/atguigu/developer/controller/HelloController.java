package com.atguigu.developer.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("ceshi=====");
        System.out.println("second commit");
        return "abc";
    }


}
