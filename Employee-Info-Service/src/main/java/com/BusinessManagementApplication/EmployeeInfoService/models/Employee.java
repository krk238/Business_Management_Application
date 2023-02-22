package com.BusinessManagementApplication.EmployeeInfoService.models;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {
    private Long employeeID;
    private String name;
    private String role;
    private BigDecimal salary;
    private String manager;
    private Long projectAssignedID;
    private LocalDate startDate;
    private LocalDate endDate = null;

    public Employee() {
    }

    public Employee(Long employeeID, String name) {
        this.employeeID = employeeID;
        this.name = name;
    }

    public Employee(Long employeeID, String name, String role, BigDecimal salary, String manager, Long projectAssignedID, LocalDate startDate, LocalDate endDate) {
        this.employeeID = employeeID;
        this.name = name;
        this.role = role;
        this.salary = salary;
        this.manager = manager;
        this.projectAssignedID = projectAssignedID;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Long employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public Long getProjectAssignedID() {
        return projectAssignedID;
    }

    public void setProjectAssignedID(Long projectAssignedID) {
        this.projectAssignedID = projectAssignedID;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                ", manager='" + manager + '\'' +
                ", projectAssignedID=" + projectAssignedID +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
