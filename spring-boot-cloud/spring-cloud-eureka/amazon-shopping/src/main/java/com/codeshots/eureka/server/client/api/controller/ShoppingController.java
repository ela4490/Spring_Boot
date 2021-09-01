package com.codeshots.eureka.server.client.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ShoppingController {

    @Autowired
    private RestTemplate template;

    /* GET method
    * Initially, it goes to the Eureka Server and find the service with
    * name PAYMENT-SERVICE. If the service is found then it will also
    * match the incoming url which is "/payment-provider/payNow" to the
    * registered Eureka Server url. If both are matched then request is
    * forwarded to the corresponding microservice which is payment-service
    * in this case.
    * @param price
    * @return response using RestTemplate
    */
    @GetMapping("/amazon-payment/{price}")
    public String invokePaymentService(@PathVariable int price) {
        String url = "http://PAYMENT-SERVICE/payment-provider/payNow/" + price;
        return template.getForObject(url, String.class);
    }
}
