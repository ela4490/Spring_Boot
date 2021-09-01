package com.codeshots.insurance.provider.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@RestController
@RequestMapping("/insurance-service")
public class InsuranceProviderApplication {

    /* GET method
    * This functions returns a list of strings using Java 8 stream API
    * Rest end point /getUpdatePlans will be mapped to Config Server
    * using GitHub repository.
    * @return list of plans
    */
    @GetMapping("/getUpadtePlans")
    public List<String> getPlans() {
        return Stream.of("Premium", "Gold", "Platinum").collect(Collectors.toList());
    }

    public static void main(String[] args) {
        SpringApplication.run(InsuranceProviderApplication.class, args);
    }

}
