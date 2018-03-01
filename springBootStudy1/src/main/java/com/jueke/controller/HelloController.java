package com.jueke.controller;

import com.jueke.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018/3/1.
 */
@Controller
public class HelloController {
    @Autowired
    private UsersService usersService;
    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @RequestMapping("/index")
    public String index(ModelMap map) {
        map.addAttribute("host", "http://baidu.com");
        map.addAttribute("address", "");
        map.addAttribute("user",usersService.findAllUser(0,10));
        return "index";
    }
}