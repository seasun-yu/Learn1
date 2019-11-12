package com.learnone;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Twest {

    @RequestMapping(value="/bean",method= RequestMethod.GET)
    public String hello(HttpServletRequest request, Model model){
        System.out.println("coming 注解");

        return "hello";
    }
}
