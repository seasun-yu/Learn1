package com.learnone.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.AbstractCollection;

public class BeanController2 extends AbstractController {


    public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
            throws Exception{
        ModelAndView mv = new ModelAndView();
        System.out.println("coming handleRequestInternal");
        mv.addObject("message", "HelloWorld");
        mv.setViewName("hello");
        return mv;
    }


}
