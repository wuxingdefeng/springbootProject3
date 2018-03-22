package com.jueke.rabbit;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/3/22.
 * 发送者
 */
@Component
public class HelloSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public String send(String context){
       // String context = "hello " + "你好我是单对单测试";
        System.out.println("单对单发送参数："+context);
        this.amqpTemplate.convertAndSend("order",context);
        return  "发送成功";
    }

}
