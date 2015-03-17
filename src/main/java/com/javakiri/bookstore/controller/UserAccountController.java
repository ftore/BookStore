package com.javakiri.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javakiri.bookstore.domain.User;
import com.javakiri.bookstore.mapper.UserMapper;
import com.javakiri.bookstore.service.UserAccountService;

@Controller
@RequestMapping(value = "/user")
public class UserAccountController {
    
    @Autowired
    private UserAccountService userAccountService;
    
    @RequestMapping(method = RequestMethod.GET)
    public String getUserByUsername(@RequestParam String username, Model model) {
        User user = userAccountService.getUserAccountByUsername(username);
        model.addAttribute("user", user);
        //System.out.println(user);
        return "index";
    }
}
