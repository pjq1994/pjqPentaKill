package com.panda.complex.rabbitmq.helloworld;

import com.panda.complex.utils.RabbitMQUtils;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.junit.Test;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Producer {

    @Test
    public void sendMsg() throws IOException, TimeoutException {
        Connection connection = new RabbitMQUtils().getConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare("hello",true,false,true,null);
        channel.basicPublish("","hello",null,"hello,consumer!".getBytes());
        new RabbitMQUtils().closeConnAndChannel(channel,connection);
    }
}
