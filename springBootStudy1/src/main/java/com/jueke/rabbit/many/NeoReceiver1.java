package com.jueke.rabbit.many;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/3/23.
 */
@Component
@RabbitListener(queues = "neo")
public class NeoReceiver1 {
    @RabbitHandler
    public void process(String neo){
        System.out.println("Receiver 1: " +neo);
    }
}
