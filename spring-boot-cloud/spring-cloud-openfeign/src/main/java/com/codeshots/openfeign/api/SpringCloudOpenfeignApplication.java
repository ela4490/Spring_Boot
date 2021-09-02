package com.codeshots.openfeign.api;

import com.codeshots.openfeign.api.client.UserClient;
import com.codeshots.openfeign.api.dto.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@EnableFeignClients
public class SpringCloudOpenfeignApplication {

    @Autowired
    private UserClient client;

    @GetMapping("/findAllUsers")
    public List<UserResponse> getAllUsers() {
        return client.getUsers();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudOpenfeignApplication.class, args);
    }

}
