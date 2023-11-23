package com.comicChat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class ComicChatApplication {
    public static void main(String[] args) {
        SpringApplication.run(ComicChatApplication.class,args);
    }
}
