package com.kastechie.bslservicegateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.kastechie.bslservicegateway.model.Customer;

@Component
public class BslAdapterService {

    @Autowired
    RestTemplate restTemplate;

    @Value("${bsl.customer.service.url}")
    private String customerServiceUrl;

    public Customer getCustomer(String id) {
        System.out.println("URL is : " + customerServiceUrl + id);
        return restTemplate.getForObject(customerServiceUrl + id, Customer.class);
    }

    public void createCustomer(Customer customer) {
        restTemplate.postForEntity(customerServiceUrl, customer, Customer.class);
    }

}
