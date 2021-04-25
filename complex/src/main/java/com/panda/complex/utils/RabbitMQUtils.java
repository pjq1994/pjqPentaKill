package com.panda.complex.utils;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class RabbitMQUtils {

    public Connection getConnection() throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("47.119.160.210");
        factory.setPort(5672);
        factory.setUsername("admin");
        factory.setPassword("admin");
        factory.setVirtualHost("my_vhost");
        Connection connection = factory.newConnection();
        return connection;
    }

    public void closeConnAndChannel(Channel channel, Connection connection) throws IOException, TimeoutException {
        channel.close();
        connection.close();
    }
}
