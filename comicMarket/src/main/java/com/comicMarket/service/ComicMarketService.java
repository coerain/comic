package com.comicMarket.service;

import com.comicMarket.feign.ComicChatFeign;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class ComicMarketService {
    @Autowired
    ComicChatFeign comicChatFeign;
    public Object get(){
        CompletableFuture<Object> completableFuture = CompletableFuture.supplyAsync(() -> {
            return comicChatFeign.getBook();
        });
        return completableFuture;
    }
}
