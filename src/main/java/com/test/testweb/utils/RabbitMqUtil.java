package com.test.testweb.utils;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * @Author: wujianqinjian
 * @Date: 2021/7/3 5:02 下午
 */
public class RabbitMqUtil {
    public static Channel getChanel() throws Exception{
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("101.34.39.234");
        /*factory.setHost("127.0.0.1")*/;
        factory.setUsername("test");
        factory.setPassword("123456");
        Connection connection =factory.newConnection();
        Channel channel= connection.createChannel();
        return channel;
    }

}
