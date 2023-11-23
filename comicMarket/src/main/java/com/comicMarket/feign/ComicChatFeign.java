package com.comicMarket.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "comicChat",path = "chat")
public interface ComicChatFeign {
    @GetMapping("getBook")
    String getBook();
}
