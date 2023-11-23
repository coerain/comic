package com.comicBook.controller;

import com.comicBook.service.ComicBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("book")
public class ComicBookController {
    @Autowired
    private ComicBookService comicBookService;
    @GetMapping("get")
    public String list(){
        comicBookService.SemTest();
        return "你不是真正的快乐"+comicBookService.name();
    }
}
