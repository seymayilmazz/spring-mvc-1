package com.codegirl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Şeyma Yılmaz on 13.8.2017.
 */
@Controller
@RequestMapping("/settings")
public class SettingsController {

    @RequestMapping("/profile")
    public String showProfilePage(){
        return "settings/profile";
    }

    @RequestMapping("/account")
    public String showAccountPage(){
        return "settings/account";
    }

    @RequestMapping("/security")
    public String showSecurityPage(){
        return "settings/security";
    }
}
