package com.glodon.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zhangx-ae on 2016/3/3.
 */

@Controller
@RequestMapping("auth")
public class LoginLogoutController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLoginPage(
            @RequestParam(value = "error", required = false) boolean error,
            ModelMap model
            ){
        if(error == true){
            model.put("error","You have entered an invalid username or password!");
        }else{
            model.put("error","");
        }
        return "login";
    }
    @RequestMapping(value = "/denied", method = RequestMethod.GET)
    public String getDeniedPage(){

        return "deniedpage";
    }

}


