package com.example.threaddemo.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class AsyncTest1 {
    @Async()
    public void async() throws InterruptedException {
        System.out.println("in AsyncTest1 thread name:" + Thread.currentThread().getName());
        TimeUnit.SECONDS.sleep(3);
    }

    @Async("async1")
    public void async1() throws InterruptedException {
        System.out.println("in AsyncTest1 thread name:" + Thread.currentThread().getName());
        TimeUnit.SECONDS.sleep(3);
    }


    @Async("async2")
    public void async2() throws InterruptedException {
        System.out.println("in AsyncTest1 thread name:" + Thread.currentThread().getName());
        TimeUnit.SECONDS.sleep(3);
    }
}
