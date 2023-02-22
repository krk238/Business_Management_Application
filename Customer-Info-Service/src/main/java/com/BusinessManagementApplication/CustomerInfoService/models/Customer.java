package com.BusinessManagementApplication.CustomerInfoService.models;

import java.math.BigDecimal;

public class Customer {
    private Long customerID;
    private String name;
    private Long CustomerProjectID;
    private BigDecimal paymentFromCustomerForProject;
    private String email;
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