package com.learnone;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ETest {

    @RequestMapping(value = "/hello",method= RequestMethod.GET)
    public String hello(HttpServletRequest request, Model model){
        return "hello";
    }

}
