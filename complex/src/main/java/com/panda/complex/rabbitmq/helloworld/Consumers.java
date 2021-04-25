package com.panda.complex.rabbitmq.helloworld;

import com.panda.complex.utils.RabbitMQUtils;
import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Consumers {
    public static void main(String[] args) throws IOException, TimeoutException {
        Connection connection = new RabbitMQUtils().getConnection();

        Channel channel = connection.createChannel();

        channel.queueDeclare("hello",true,false,true,null);
        Consumer consumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String s, Envelope envelope, AMQP.BasicProperties basicProperties, byte[] bytes)
                    throws IOException {
                System.out.println("消费者:"+new String(bytes));
            }
        };
        channel.basicConsume("hello", true, consumer);
    }
}
