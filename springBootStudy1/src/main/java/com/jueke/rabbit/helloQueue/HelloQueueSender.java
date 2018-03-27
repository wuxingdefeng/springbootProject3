package com.jueke.rabbit.helloQueue;

import org.apache.log4j.Logger;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Created by Administrator on 2018/3/27.
 */
@Component
public class HelloQueueSender implements RabbitTemplate.ConfirmCallback{
    @Autowired
    private RabbitTemplate rabbitTemplatenew;
    Logger logger = Logger.getLogger(this.getClass());

    public String sendString (){
        rabbitTemplatenew.setConfirmCallback(this);
        String msg2="callbackSender : i am callback sender";
        System.out.println(msg2);
        CorrelationData correlationData = new CorrelationData(UUID.randomUUID().toString());
        System.out.println("callbackSender UUID: " + correlationData.getId());
        this.rabbitTemplatenew.convertAndSend("helloQueue", (Object) msg2,correlationData);
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
