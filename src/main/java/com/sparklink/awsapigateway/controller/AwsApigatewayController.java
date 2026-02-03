package com.sparklink.awsapigateway.controller;

import com.sparklink.awsapigateway.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class AwsApigatewayController {

    private List<Employee> employeeList = new ArrayList<>();

    @PostMapping
    public Employee addEmployee (@RequestBody Employee employee){
        employeeList.add(employee);
        return employee;
    }

    @GetMapping
    public List<Employee> getEmployees(){
        return employeeList;
    }

}
