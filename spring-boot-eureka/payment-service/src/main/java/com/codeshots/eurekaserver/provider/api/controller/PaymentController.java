package com.codeshots.eurekaserver.provider.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment-provider")
public class PaymentController {

    /* GET method
    * @param price
    * @return String message
    */
    @GetMapping("/payNow/{price}")
    public String payNow(@PathVariable int price) {
        return "Payment with " + price + " is successful!";
    }
}
