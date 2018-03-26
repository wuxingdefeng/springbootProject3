package com.jueke.rabbit;


import org.apache.log4j.Logger;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class HelloSender implements RabbitTemplate.ConfirmCallback{

    @Autowired
    private RabbitTemplate rabbitTemplatenew;
    Logger logger = Logger.getLogger(this.getClass());

    public String sendHello(String context){
        rabbitTemplatenew.setConfirmCallback(this);
        String msg="callbackSender : i am callback sender";
        System.out.println(msg );
        CorrelationData correlationData = new CorrelationData(UUID.randomUUID().toString());
        System.out.println("callbackSender UUID: " + correlationData.getId());
       // System.out.println("生产者发送消息内容为："+context);
        this.rabbitTemplatenew.convertAndSend("hello", (Object) context,correlationData);
        return "发送完成";
    }

    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        this.logger.info(" 消息id:" + correlationData);
        if (ack) {
            this.logger.info("消息发送确认成功");
        } else {
            this.logger.info("消息发送确认失败:" + cause);

        }
        System.out.println("callbakck confirm: " + correlationData.getId());
    }
}