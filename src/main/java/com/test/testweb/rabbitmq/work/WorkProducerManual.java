package com.test.testweb.rabbitmq.work;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.MessageProperties;
import com.test.testweb.utils.RabbitMqUtil;

import java.util.Scanner;

/**
 * @Author: wujianqinjian
 * @Date: 2021/7/4 2:23 下午
 */
public class WorkProducerManual {
    public static final String TASK_QUEUE_NAME="manual_que";

    public static void main(String[] args) throws Exception {
        Channel channel= RabbitMqUtil.getChanel();
        channel.confirmSelect();
        boolean durable= true;
    //Declare queue
        channel.queueDeclare(TASK_QUEUE_NAME,durable,false,false,null);
        Scanner scanner = new Scanner(System.in);
/*        while(scanner.hasNext()){
            String message = scanner.next();
            channel.basicPublish("",TASK_QUEUE_NAME, MessageProperties.PERSISTENT_TEXT_PLAIN,message.getBytes("UTF-8"));
            System.out.println("");
        }*/
        for (int i = 0; i <1000 ; i++) {
            String message="发送第"+i+"条消息";
            channel.basicPublish("",TASK_QUEUE_NAME, MessageProperties.PERSISTENT_TEXT_PLAIN,message.getBytes("UTF-8"));
            System.out.println(message);

        }
    }





}
