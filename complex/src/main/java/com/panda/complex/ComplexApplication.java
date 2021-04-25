package com.panda.complex;

import org.springframework.boot.SpringApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan("com.panda.complex")
@SpringBootApplication
@EnableTransactionManagement
public class ComplexApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComplexApplication.class, args);
    }

}
