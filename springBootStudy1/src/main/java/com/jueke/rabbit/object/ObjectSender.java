package com.jueke.rabbit.object;

import com.jueke.entity.USERS;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/3/23.
 */
@Component
public class ObjectSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(USERS users){
        System.out.println("Sender object: " + users.toString());
        this.rabbitTemplate.convertAndSend("object", users);
    }
}
