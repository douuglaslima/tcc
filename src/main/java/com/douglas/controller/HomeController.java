package com.douglas.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class HomeController {

    @Value("${welcome.message:test}")
    private String message;

    @RequestMapping("/home")
    public String home(Map<String, Object> model) {
        model.put("message", this.message);
        return "home";
    }
}
