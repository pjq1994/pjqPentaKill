package com.panda.complex.rabbitmq.workqueues;

import com.panda.complex.utils.RabbitMQUtils;
import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Consumer2 {
    public static void main(String[] args) throws IOException, TimeoutException {
        Connection connection = new RabbitMQUtils().getConnection();
        Channel channel = connection.createChannel();
        channel.basicQos(1);
        channel.queueDeclare("workQueues",true,false,false,null);

        channel.basicConsume("",false,new DefaultConsumer(channel){
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                System.out.println("消费者2:"+new String(body));
                channel.basicAck(envelope.getDeliveryTag(),false);
            }
        });

    }
}
