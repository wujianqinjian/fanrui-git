package com.test.testweb.rabbitmq.confirm;

import com.rabbitmq.client.Channel;
import com.test.testweb.utils.RabbitMqUtil;

import java.util.UUID;

/**
 * @Author: wujianqinjian
 * @Date: 2021/7/4 9:12 下午
 */
public class ConfirmMessageProduce {

    public static final int  MESSAGE_COUNT=1000;

    public static void main(String[] args) throws  Exception {

        ConfirmMessageProduce.publishMessageIndividually();
    }

    //
    public static void publishMessageIndividually() throws Exception{
        Channel channel = RabbitMqUtil.getChanel();
        String queueName= UUID.randomUUID().toString();
        channel.queueDeclare(queueName,false,false,false,null);
        //开启消息确认
        channel.confirmSelect();
        //执行开始时间
        long begin = System.currentTimeMillis();
        // 批量发送消息
        for (int i = 0; i < 1000; i++) {
            String message = i+ "";
            channel.basicPublish("",queueName,null,message.getBytes("UTF-8"));
            boolean flag= channel.waitForConfirms();
            if(flag){
                System.out.println("第"+i+"消息发送成功");
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("发布"+MESSAGE_COUNT+"条消息共计耗时"+(end-begin)+"ms");
    }
}
