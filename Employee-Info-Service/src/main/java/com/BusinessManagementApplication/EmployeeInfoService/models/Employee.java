package com.BusinessManagementApplication.EmployeeInfoService.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;


@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EmpID")
    private Long employeeID;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "role")
    private String role;
    @Column(name = "salary")
    private BigDecimal salary;
    @Column(name = "manager")
    private String manager;
    @Column(name = "projectAssignedID")
    private Long projectAssignedID;
    @Column(name = "startDate")
    private LocalDate startDate;
    @Column(name = "endDate")
    private LocalDate endDate = null;

    public Employee() {
    }

    public Employee(Long employeeID, String name) {
        this.employeeID = employeeID;
        this.lastName = name;
    }

    public Employee(Long employeeID, String firstName, String lastName, String role, BigDecimal salary, String manager, Long projectAssignedID, LocalDate startDate, LocalDate endDate) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
                ", name='" + lastName + '\'' +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                ", manager='" + manager + '\'' +
                ", projectAssignedID=" + projectAssignedID +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
