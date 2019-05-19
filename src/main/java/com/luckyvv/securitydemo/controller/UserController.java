package com.luckyvv.securitydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.ws.rs.Path;

/**
 * @author JackJun
 * 2019/5/18 11:32
 * Life is not just about survival, but VV and distance.
 */
@Controller
@RequestMapping("/")
public class UserController {

    @GetMapping("/sayHello")
    public @ResponseBody String test(){
        return "Hello, Spring Security.";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
