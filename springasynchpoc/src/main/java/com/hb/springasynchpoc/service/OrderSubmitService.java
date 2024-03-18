package com.hb.springasynchpoc.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderSubmitService {


    public void processPayment() {
        log.info(this.getClass().getName()+":processPayment");
        log.info(Thread.currentThread().getName());
    }

    public void processNotification() throws InterruptedException {
        Thread.sleep(1000);
        log.info(this.getClass().getName()+":processNotification");
        log.info(Thread.currentThread().getName());
    }

    @Async("asyncTaskExecutor")     // individual method level
    public void processOrder() throws InterruptedException {
        Thread.sleep(4000);
        log.info(this.getClass().getName()+":processOrder");
        log.info(Thread.currentThread().getName());
    }

    @Async("asyncTaskExecutor")
    public void orderDespatch() throws InterruptedException {
        Thread.sleep(2000);
        log.info(this.getClass().getName()+":orderDespatch");
        log.info(Thread.currentThread().getName());
    }

    @Async("asyncTaskExecutor")
    public void orderDelivery() throws InterruptedException {
        Thread.sleep(5000);
        log.info(this.getClass().getName()+":orderDelivery");
        log.info(Thread.currentThread().getName());
    }

    @Async
    public void orderDelivery2() throws InterruptedException {
        Thread.sleep(5000);
        log.info(this.getClass().getName()+":orderDelivery2");
        log.info(Thread.currentThread().getName());
    }

    @Async
    public void orderDespatch2() throws InterruptedException {
        Thread.sleep(4000);
        log.info(this.getClass().getName()+":orderDespatch2");
        log.info(Thread.currentThread().getName());
    }

    @Async
    public void processOrder2() throws InterruptedException {
        Thread.sleep(3000);
        log.info(this.getClass().getName()+":processOrder2");
        log.info(Thread.currentThread().getName());
    }
}
