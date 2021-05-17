package com.panda.eurekaconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaConsumerApplication {
    private static Logger logger = LoggerFactory.getLogger(EurekaConsumerApplication.class);

    public static void main(String[] args) {
        logger.debug("==========启动eureka-consumer===========");
        SpringApplication.run(EurekaConsumerApplication.class, args);
    }

}
