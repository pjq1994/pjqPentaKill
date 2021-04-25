package com.panda.complex.rabbitmq.workqueues;

import com.panda.complex.utils.RabbitMQUtils;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import org.junit.Test;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Producer {

    @Test
    public void sendMsg() throws IOException, TimeoutException {
        Connection connection = new RabbitMQUtils().getConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare("workQueues",true,false,false,null);
        for (int i = 1; i < 101; i++) {
            channel.basicPublish("","workQueues",null,("hi,consumer,this is msg"+i).getBytes());
        }
        new RabbitMQUtils().closeConnAndChannel(channel,connection);
    }
}
