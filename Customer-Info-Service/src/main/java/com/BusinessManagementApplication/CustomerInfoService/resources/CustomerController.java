package com.BusinessManagementApplication.CustomerInfoService.resources;

import com.BusinessManagementApplication.CustomerInfoService.models.Customer;
import com.BusinessManagementApplication.CustomerInfoService.repositories.customerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@RestController // http://localhost:8083
public class CustomerController {
    List<Customer> customers1 = Arrays.asList(
            new Customer(123L, "Artemis", 1234L, new BigDecimal(1500000.00), "Artemis@corporate.com", true ),
            new Customer(223L, "Marz1", 2234L, new BigDecimal(3000000.00), "Marz1@corporate.com", true),
            new Customer(323L, "IntelFrontier", 3234L, new BigDecimal(2000000.00), "IntelFrontier@corporate.com", true)
            );

    private final customerRepository customerRepository;
    @Autowired
    public CustomerController(customerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }


    /*@Bean
    public customerRepository customerRepository() {
        return new customerRepository();
    }*/

    /*@RequestMapping("/customers")
    public List<Customer> testNow() {
        return customers1;
    }*/


    @RequestMapping("/customers/{customerID}")
    public ResponseEntity<String> getCustomer(@PathVariable("customerID") Long customerID) {
        Customer matchingCustomer = null;
        for (Customer customer : customers1) {
            if (customer.getCustomerID().equals(customerID)) {
                matchingCustomer = customer;
                break;
            }
        }
        if (matchingCustomer != null) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(matchingCustomer.toString());
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No customer found");
        }
    }
}

// "No customer found with ID " + customerID
