package com.comicChat.controller;

import com.comicChat.feign.ComicBookFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("chat")
public class ComicChatController {
    @Autowired
    private ComicBookFeign comicBookFeign;
    @GetMapping("getBook")
    public String book(){
        System.out.println("为啥呢");
        return "comicBookFeign.book()";
    }
}
