package com.jueke.controller;

import com.jueke.expection.BusinessException;
import com.jueke.rabbit.HelloSender;
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
    @Autowired
    private HelloSender helloSender;
    @ResponseBody
    @RequestMapping("/hello")
    public String hello() throws Exception{
        String context= "码云";
        helloSender.sendHello(context);
       /* System.out.println("抛出空指针");
        throw new NullPointerException("空指针");*/
        //return "Hello World";
        return "发送完成";
    }
    @RequestMapping("/json")
    @ResponseBody
    public Object json() throws Exception {
        long a= (long) 12.6;
        int d ='c'+100;
        System.out.println(a);
       throw new BusinessException("发生错误2");
      // return "sdf";
    }
    @RequestMapping("/index")
    public String index(ModelMap map) {
        map.addAttribute("host", "http://baidu.com33");
        map.addAttribute("address", "3223444");
        map.addAttribute("user",usersService.findAllUser(0,10));
        return "index";
    }


}
