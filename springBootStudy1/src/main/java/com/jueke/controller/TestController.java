package com.jueke.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/2/28.
 */
@RestController
public class TestController {
    @RequestMapping("/")
    public String index(){
        return "你好23饿33";
    }
}
