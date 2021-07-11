package com.test.testweb.rabbitmq.work;

import com.rabbitmq.client.CancelCallback;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.DeliverCallback;
import com.test.testweb.utils.RabbitMqUtil;

/**
 * @Author: wujianqinjian
 * @Date: 2021/7/3 5:20 下午
 */
public class WorkConsumerAutoOne {

    public static final String QUEUE_NAME= "hello";

 /*   public static void*/

    public static void main(String[] args) throws Exception{
        Channel channel= RabbitMqUtil.getChanel();
        DeliverCallback deliverCallback =(consumerTag,message) ->{
            System.out.println("接受到的消息"+new String(message.getBody()));
        };

        CancelCallback cancelCallback = (consumerTag) -> {
            System.out.println(consumerTag+"消息着取消消费接口会调逻辑");
        };
        System.out.println("C2等待接收");
        channel.basicConsume(QUEUE_NAME,true,deliverCallback,cancelCallback);
    }
}
