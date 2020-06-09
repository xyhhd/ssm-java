package com.bianyiit.controller;

import com.bianyiit.pojo.User;
import com.bianyiit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Component
@ResponseBody
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userServiceImpl;
    @RequestMapping("/find")
    public ModelAndView findAll(){
        System.out.println(123);
        ModelAndView modelAndView = new ModelAndView();
        List<User> list = userServiceImpl.findAll();
        System.out.println(list);
        modelAndView.addObject(list);
        modelAndView.setViewName("success");
        System.out.println(233);  //假装有新功能
        return modelAndView;
    }
}
