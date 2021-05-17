package com.panda.eurekaprovider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaProviderApplication {
    private static Logger logger = LoggerFactory.getLogger(EurekaProviderApplication.class);

    public static void main(String[] args) {
        logger.debug("==========启动eureka-client==========");
        SpringApplication.run(EurekaProviderApplication.class, args);
    }



}
