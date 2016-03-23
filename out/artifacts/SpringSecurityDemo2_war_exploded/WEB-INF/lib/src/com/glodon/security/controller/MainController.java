package com.glodon.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zhangx-ae on 2016/3/3.
 */

@Controller
@RequestMapping("/main")
public class MainController {

    @RequestMapping(value = "/common", method = RequestMethod.GET)
    public String getCommonPage(){

        return "commonpage";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String getAdminPage(){

        return "admin";
    }
}
