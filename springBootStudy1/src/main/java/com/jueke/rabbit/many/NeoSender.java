package com.jueke.rabbit.many;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/3/23.
 */
@Component
public class NeoSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;


    public void send(int i){
        String context = "spirng boot neo queue"+" ****** "+i;
        System.out.println("Sender1 : " + context);
        rabbitTemplate.convertAndSend("neo",context);
    }
}
