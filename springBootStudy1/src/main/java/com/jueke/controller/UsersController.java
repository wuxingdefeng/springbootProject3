package com.jueke.controller;

import com.jueke.entity.USERS;
import com.jueke.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018/2/28.
 */
@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @ResponseBody
    @RequestMapping(value = "/add")
    public int addUser(@RequestBody USERS user){
        return usersService.addUser(user);
    }
    @ResponseBody
    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){

        return usersService.findAllUser(pageNum,pageSize);

    }
}
