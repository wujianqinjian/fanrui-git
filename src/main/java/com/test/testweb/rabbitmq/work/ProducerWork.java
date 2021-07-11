package com.test.testweb.rabbitmq.work;

import com.rabbitmq.client.Channel;
import com.test.testweb.utils.RabbitMqUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: wujianqinjian
 * @Date: 2021/7/3 8:58 下午
 */
public class ProducerWork {

    public static final String QUEUE_NAME= "hello";

    public static void main(String[] args)  throws  Exception{
        Channel channel= RabbitMqUtil.getChanel();
        channel.queueDeclare(QUEUE_NAME,false,false,false,null);

        Scanner scanner=new Scanner(System.in);
        List<String> list= new ArrayList<>();
        for (int j = 0; j < 1000; j++) {
            for (int i = 0; i < 5000; i++) {
                String tmp="发送第"+i+"条消息";
                list.add(tmp);
                channel.basicPublish("",QUEUE_NAME,null,tmp.getBytes());
                System.out.println("发送完成第："+list.get(i)+"条消息");
            }
        }





    }
}
