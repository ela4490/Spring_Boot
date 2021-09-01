package com.codeshots.insurance.client.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication
@RestController
@RefreshScope
public class InsuranceClientApplication {

    @Autowired
    @Lazy
    private RestTemplate template;

    @Value("${insurance.provider.url}")
    private String url;

    /* GET method
    * This function consumes the insurance-provider using Rest template.
    * From insurance-client, the request will go to the insurance-config-server.
    * In insurance-config-server, application.properties file will fetch the
    * key ${insurance.provider.url}. Based on the key, it will find the
    * appropriate end point URL which is mapped. This will invoke the service
    * then we will get the required response.
    * @return list of plans
    */
    @GetMapping("/getPlans")
    public List<String> getPlans() {
        List<String> plans = template.getForObject(url, List.class);
        return plans;
    }

    public static void main(String[] args) {
        SpringApplication.run(InsuranceClientApplication.class, args);
    }

    @Bean
    public RestTemplate template() {
        return new RestTemplate();
    }
}
