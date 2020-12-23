package com.mq.license.server;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author mq
 * @description: TODO
 * @title: ServerApplication
 * @projectName license-mq
 * @date 2020/12/2317:32
 */
@SpringBootApplication
@Slf4j
public class ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class,args);
        log.info("ServerApplication is start......");
    }
}
