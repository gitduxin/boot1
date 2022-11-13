package com.dx.demo.project.user.controller;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

@Controller
public class IndexController {

    @Resource
    Environment env;

    @GetMapping
    public String index(Model model){
        model.addAttribute("message",env.getProperty("test"));
        return "index";
    }
}
