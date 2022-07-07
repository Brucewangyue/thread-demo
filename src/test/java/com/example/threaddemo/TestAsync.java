package com.example.threaddemo;

import com.example.threaddemo.async.AsyncTest1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeUnit;

@SpringBootTest
public class TestAsync {

    @Autowired
    AsyncTest1 asyncTest1;

    /**
     * EnableAsync
     * @throws InterruptedException
     */
    @Test
    public void test_async() throws InterruptedException {
        System.out.println("in test thread name:" + Thread.currentThread().getName());

        asyncTest1.async();

        TimeUnit.MINUTES.sleep(10);
    }

    /**
     *
     * @throws InterruptedException
     */
    @Test
    public void test_async_multi() throws InterruptedException {
        System.out.println("in test thread name:" + Thread.currentThread().getName());

        for (int i = 0; i < 200; i++) {
            asyncTest1.async();
        }

        TimeUnit.MINUTES.sleep(10);
    }

    /**
     *
     * @throws InterruptedException
     */
    @Test
    public void test_async1_multi() throws InterruptedException {
        System.out.println("in test thread name:" + Thread.currentThread().getName());

        for (int i = 0; i < 200; i++) {
            asyncTest1.async1();
        }

        TimeUnit.MINUTES.sleep(10);
    }

    /**
     *
     * @throws InterruptedException
     */
    @Test
    public void test_async2_multi() throws InterruptedException {
        System.out.println("in test thread name:" + Thread.currentThread().getName());

        for (int i = 0; i < 200; i++) {
            asyncTest1.async();
        }

        TimeUnit.MINUTES.sleep(10);
    }
}
