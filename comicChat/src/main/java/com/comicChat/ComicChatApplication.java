package com.comicChat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@FeignClient
public class ComicChatApplication {
    public static void main(String[] args) {
        SpringApplication.run(ComicChatApplication.class,args);
    }
}
