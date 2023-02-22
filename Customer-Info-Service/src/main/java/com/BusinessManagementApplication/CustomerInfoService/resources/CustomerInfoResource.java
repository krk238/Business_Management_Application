package com.BusinessManagementApplication.CustomerInfoService.resources;

import com.BusinessManagementApplication.CustomerInfoService.models.Customer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@RestController // http://localhost:8083
public class CustomerInfoResource {
    List<Customer> customers = Arrays.asList(
            new Customer(123L, "Artemis", 1234L, new BigDecimal(1500000.00), "Artemis@corporate.com", true ),
            new Customer(223L, "Marz1", 2234L, new BigDecimal(3000000.00), "Marz1@corporate.com", true),
            new Customer(323L, "IntelFrontier", 3234L, new BigDecimal(2000000.00), "IntelFrontier@corporate.com", true)
            );

    @RequestMapping("/customers")
    public List<Customer> allCustomers() {
        return customers;
    }

    @RequestMapping("/customers/{customerID}")
    public String getCustomer(@PathVariable("customerID") Long customerID) {
        Customer matchingCustomer = null;
        for (Customer customer : customers) {
            if (customer.getCustomerID().equals(customerID)) {
                matchingCustomer = customer;
                break;
            }
        }
        if (matchingCustomer != null) {
            return matchingCustomer.toString();
        } else {
            return "No customer found with ID " + customerID;
        }
    }
}
