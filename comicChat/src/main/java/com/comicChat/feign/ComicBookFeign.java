package com.comicChat.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "comicBook")
public interface ComicBookFeign {
    @GetMapping("/book/get")
    String book();

}
