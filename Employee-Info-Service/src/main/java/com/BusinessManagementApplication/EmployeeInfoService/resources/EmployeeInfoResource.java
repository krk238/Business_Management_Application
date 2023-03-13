package com.BusinessManagementApplication.EmployeeInfoService.resources;

import com.BusinessManagementApplication.EmployeeInfoService.models.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeInfoResource {
    List<Employee> employees = Arrays.asList(
            new Employee(1111L, "Kamil", "Khan", "Senior Developer", new BigDecimal(100000.00), "Michael Scott", 1234L, LocalDate.now(), null),
            new Employee(2222L, "Jason", "Clark", "Systems Administrator", new BigDecimal(105000.00), "Michael Scott", 1234L, LocalDate.now(), null),
            new Employee(3333L, "Michael", "Scott", "CTO", new BigDecimal(105000.00), "Alex Bateman", 1234L, LocalDate.now(), null)
    );

    @RequestMapping("/employees")
    public List<Employee> allEmployees() {
        return employees;
    }

    @RequestMapping("/employees/{employeeID}")
    public String getEmployee(@PathVariable("employeeID") Long employeeID) {
        Employee matchingEmployee = null;
        for (Employee employee : employees) {
            if (employee.getEmployeeID().equals(employeeID)) {
                matchingEmployee = employee;
                break;
            }
        }
        if (matchingEmployee != null) {
            return matchingEmployee.toString();
        } else {
            return "No customer found with ID " + employeeID;
        }
    }
}
