package com.jueke.rabbit.topic;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/3/26.
 */
@Component
public class TopicSender {

    @Autowired
    private RabbitTemplate rabbitTemplateNew;


    public void send() {
        String context = "hi, i am message all";
        System.out.println("Sender : " + context);
        this.rabbitTemplateNew.convertAndSend("exchange", "topic.me", context);
    }

    public void send1() {
        String context = "hi, i am message 1";
        System.out.println("Sender1 : " + context);
        this.rabbitTemplateNew.convertAndSend("exchange", "topic.message", context);
    }

    public void send2() {
        String context = "hi, i am messages 2";
        System.out.println("Sender2 : " + context);
        this.rabbitTemplateNew.convertAndSend("exchange", "topic.messages", context);
    }
}
