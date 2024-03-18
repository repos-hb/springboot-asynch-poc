package com.hb.springasynchpoc.web;

import com.hb.springasynchpoc.service.OrderSubmitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderSubmitController {

    @Autowired
    private OrderSubmitService orderSubmitService;

    @PostMapping("/submit")
    public ResponseEntity submitOrder() throws InterruptedException {
        orderSubmitService.processPayment();
        orderSubmitService.processNotification();
        orderSubmitService.processOrder();
        orderSubmitService.orderDespatch();
        orderSubmitService.orderDelivery();
        return ResponseEntity.ok(HttpStatus.CREATED);
    }

    @PostMapping("/submit2")
    public ResponseEntity submitOrder2() throws InterruptedException {
        orderSubmitService.processOrder2();
        orderSubmitService.orderDespatch2();
        orderSubmitService.orderDelivery2();
        return ResponseEntity.ok(HttpStatus.CREATED);
    }
}
