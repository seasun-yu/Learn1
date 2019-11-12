package com.learnone.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BeanController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
        throws Exception{
        ModelAndView mv = new ModelAndView();
        System.out.println("coming");
        mv.addObject("message", "HelloWorld");
        mv.setViewName("hello");
        return mv;
    }
}
