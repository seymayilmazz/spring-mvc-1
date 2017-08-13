package com.codegirl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by Şeyma Yılmaz on 12.8.2017.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String showHomePage(){
       return "home/index";
    }

    @RequestMapping("/about")
    public String showAboutPage(){
        return "home/about";
    }

}
