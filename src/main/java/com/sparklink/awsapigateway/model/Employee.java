package com.sparklink.awsapigateway.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {

    private int employeeId;
    private String employeeName;
    private double employeeSalary;

}
