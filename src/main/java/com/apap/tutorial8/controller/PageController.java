package com.apap.tutorial8.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
