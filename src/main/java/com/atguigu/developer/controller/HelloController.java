package com.atguigu.developer.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("测试====分支");
        System.out.println("二次测试分支");
        System.out.println("second commit");
        return "abc";
    }


}
