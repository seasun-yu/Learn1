package com.learnone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class BeanController3 {
    @RequestMapping(value="/bean3",method= RequestMethod.GET)
    public String hello(HttpServletRequest request,Model model){
        System.out.println("coming 注解");

        return "hello";
    }

    @RequestMapping("/bean4")
    public ModelAndView hello(HttpServletRequest request){
        System.out.println("coming 注解");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("hello");
        return mav;
    }
}
