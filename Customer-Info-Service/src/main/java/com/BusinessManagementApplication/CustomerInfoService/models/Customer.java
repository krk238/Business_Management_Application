package com.BusinessManagementApplication.CustomerInfoService.models;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customerID")
    private Long customerID;

    @Column(name = "name")
    private String name;

    @Column(name = "customerProjectID")
    private Long CustomerProjectID;

    @Column(name = "paymentFromCustomerForProject")
    private BigDecimal paymentFromCustomerForProject;

    @Column(name = "email")
    private String email;

    @Column(name = "active")
    private Boolean active;

    public Customer() {
    }

    public Customer(Long customerID, String name) {
        this.customerID = customerID;
        this.name = name;
    }

    public Customer(Long customerID, String name, Long projectID, BigDecimal paymentFromCustomerForProject, String email, Boolean active) {
        this.customerID = customerID;
        this.name = name;
        this.CustomerProjectID = projectID;
        this.paymentFromCustomerForProject = paymentFromCustomerForProject;
        this.email = email;
        this.active = active;
    }



    public Long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Long customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getProjectID() {
        return CustomerProjectID;
    }

    public void setProjectID(Long projectID) {
        this.CustomerProjectID = projectID;
    }

    public BigDecimal getPaymentFromCustomerForProject() {
        return paymentFromCustomerForProject;
    }

    public void setPaymentFromCustomerForProject(BigDecimal paymentFromCustomerForProject) {
        this.paymentFromCustomerForProject = paymentFromCustomerForProject;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", name='" + name + '\'' +
                ", CustomerProjectID=" + CustomerProjectID +
                ", paymentFromCustomerForProject=" + paymentFromCustomerForProject +
                ", email='" + email + '\'' +
                ", active=" + active +
                '}';
    }
}