package com.comicMarket.controller;

import com.comicMarket.feign.ComicChatFeign;
import com.comicMarket.service.ComicMarketService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("market")
public class ComicMarketController {
    @Autowired
    ComicMarketService comicMarketService;
    @GetMapping("chat")
    public Object chat() {
        return comicMarketService.get();
    }
}
