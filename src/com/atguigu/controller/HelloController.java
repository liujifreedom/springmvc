package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Chunsheng Zhang 尚硅谷
 * @create 2021/5/28 14:34
 */
@Controller
public class HelloController {


    @RequestMapping("/HelloSpringMVC")
    public String hello(){
        System.out.println("springMVC!!!");
        //跳转到/WEB-INF/success.jsp
        return "success";
    }


}
