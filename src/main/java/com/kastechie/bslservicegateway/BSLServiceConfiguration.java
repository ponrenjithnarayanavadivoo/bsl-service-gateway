package com.kastechie.bslservicegateway;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BSLServiceConfiguration {
    
    @Bean
    RestTemplate createRestTemplate()
    {
       return new RestTemplate();
    }
}
