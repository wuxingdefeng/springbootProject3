package com.jueke.rabbit.object;

import com.jueke.entity.USERS;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/3/23.
 */
@Component
public class ObjectReceiver {


    @RabbitHandler
    @RabbitListener(queues = "object")
    public void process(USERS users){
        System.out.println("Receiver object : " + users);
    }
}
