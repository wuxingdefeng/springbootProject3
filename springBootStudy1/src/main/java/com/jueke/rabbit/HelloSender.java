package com.jueke.rabbit;


import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public String sendHello(String context){
        System.out.println("生产者发送消息内容为："+context);
        rabbitTemplate.convertAndSend("hello",context);
        return "发送完成";
    }
}