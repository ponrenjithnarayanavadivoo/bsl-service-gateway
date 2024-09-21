package com.kastechie.bslservicegateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kastechie.bslservicegateway.model.Customer;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1/api-gateway")
public class BslServiceController {

    @Autowired
    BslAdapterService bslAdapterService;

    @GetMapping("/customer/{id}")
    public Customer getCustomer(@PathVariable String id) {
        return bslAdapterService.getCustomer(id);
    }

    @PostMapping("/customer")
    public void createCustomer(@RequestBody @Valid Customer customer) {

        bslAdapterService.createCustomer(customer);
    }

}
