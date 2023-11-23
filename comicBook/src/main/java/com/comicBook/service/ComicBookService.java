package com.comicBook.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

@Service
public class ComicBookService {
    public String name(){
        return "hahhaha";
    }
    public void SemTest(){
        Semaphore semaphore = new Semaphore(10);
        for (int i=0;i<100;i++){
            int finalI = i;
            new Thread(()->{
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName());
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    semaphore.release();
                }
            },"线程"+finalI).start();
        }
    }
}
