package com.jueke.rabbit.helloQueue;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "helloQueue")
public class HelloQueueReceiver {

    @RabbitHandler
    public void process(String hello){
        System.out.println("消费者接受信息："+hello);
    }
}