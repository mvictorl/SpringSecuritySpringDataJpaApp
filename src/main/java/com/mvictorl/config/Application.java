package com.mvictorl.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by mvictorl on 7/14/17.
 */

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.mvictorl")
@EntityScan(basePackages = "com.mvictorl")
public class Application {
    public static void main(String[] args) throws Throwable {
        SpringApplication.run(Application.class,args);
    }
}
