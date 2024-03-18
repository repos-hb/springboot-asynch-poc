package com.hb.springasynchpoc.service;

import lombok.extern.slf4j.Slf4j;
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

    public void processOrder() throws InterruptedException {
        Thread.sleep(4000);
        log.info(this.getClass().getName()+":processOrder");
        log.info(Thread.currentThread().getName());
    }

    public void orderDespatch() throws InterruptedException {
        Thread.sleep(2000);
        log.info(this.getClass().getName()+":orderDespatch");
        log.info(Thread.currentThread().getName());
    }

    public void orderDelivery() throws InterruptedException {
        Thread.sleep(5000);
        log.info(this.getClass().getName()+":orderDelivery");
        log.info(Thread.currentThread().getName());
    }
}
