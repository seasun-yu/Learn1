package com.learnone.controller;

import com.learnone.entity.User;
import com.learnone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/info" ,method = RequestMethod.GET)
    @ResponseBody
    public String getUserInfo(Model model){
        Long id = 1L;
        User user = userService.findById(id);
        model.addAttribute("results",user);
        return "user";
    }
}
