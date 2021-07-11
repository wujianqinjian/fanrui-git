package com.test.testweb.rabbitmq.work;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.DeliverCallback;
import com.test.testweb.utils.RabbitMqUtil;
import com.test.testweb.utils.SleepUtil;

/**
 * @Author: wujianqinjian
 * @Date: 2021/7/4 4:53 下午
 */
public class WorkConsumerManualOne {

    public static final String TASK_QUEUE_NAME="manual_que";

    public static void main(String[] args)  throws  Exception{
        Channel channel = RabbitMqUtil.getChanel();
        System.out.println("C1准备接受消息 ");

        DeliverCallback deliverCallback= (comsumerTag,message) -> {
            //SleepUtil.sleep(1);
            System.out.println("接收到的消息："+ new String(message.getBody(),"UTF-8"));
            // false代表不批量应答
            channel.basicAck(message.getEnvelope().getDeliveryTag(),false);
        };

        //采用不公平分发
        int prefetchCount=1;
        channel.basicQos(prefetchCount);

        boolean autoAuto = false;
        channel.basicConsume(TASK_QUEUE_NAME,autoAuto,deliverCallback,(consumerTag -> {
            System.out.println(consumerTag+ "消费者取消消费接口回调");
        }));
    }
}
