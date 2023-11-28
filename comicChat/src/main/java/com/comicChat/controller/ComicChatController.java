package com.comicChat.controller;

import com.comicChat.feign.ComicBookFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("chat")
public class ComicChatController {
    @Autowired
    private ComicBookFeign comicBookFeign;
    @Autowired
    private KafkaTemplate<String, String> templates;
    @GetMapping("getBook")
    public String book(){
        templates.send("topic-test","one","什么鬼");
        System.out.println("为啥呢");
        return "comicBookFeign.book()";
    }
}
