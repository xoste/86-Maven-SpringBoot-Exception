package com.xoste.leon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Leon
 */
@Controller
public class UsersController {
    @RequestMapping("/showUsers1")
    public String showPage() {
        int x = 5 / 0;
        return "/index";
    }
    @RequestMapping("/showUsers2")
    public String showPage2(String s) {
        s.toString();
        return "/index";
    }
}
