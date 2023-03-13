package com.BusinessManagementApplication.CustomerInfoService.repositories;
import com.BusinessManagementApplication.CustomerInfoService.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface customerRepository extends JpaRepository<Customer, Long> {
    List<Customer> getAllCustomers();

    List<Customer> findAllById(int i);
}
