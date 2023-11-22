package com.comicBook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@FeignClient
public class ComicBookApplication {
    public static void main(String[] args) {
        SpringApplication.run(ComicBookApplication.class,args);
    }
}
