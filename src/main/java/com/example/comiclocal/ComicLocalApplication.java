package com.example.comiclocal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@FeignClient
public class ComicLocalApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComicLocalApplication.class, args);
    }

}
