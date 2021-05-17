package com.panda.eurekaconsumer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;

@SpringBootTest
class EurekaConsumerApplicationTests {

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @Test
    void contextLoads() {
        for (int i = 0; i < 10; i++) {
            ServiceInstance instance = loadBalancerClient.choose("eureka-provider");
            System.out.println(instance.getPort());
        }
    }

}
