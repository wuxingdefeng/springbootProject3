package com.jueke.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/3/22.
 * hello接受者
 */
@Component
@RabbitListener(queues = "order")
public class HelloReceiver {
    @RabbitHandler
    public void process(String order){
        System.out.println("单对单接受参数："+order);
        System.out.println("sdsd");
    }
}
