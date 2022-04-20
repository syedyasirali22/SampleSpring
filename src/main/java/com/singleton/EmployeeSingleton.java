package com.singleton;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
public class EmployeeSingleton {

    private Double salary;
    private String grade;
    private String designation;

    public Double getSalary() {
        return salary;
    }

    public String getGrade() {
        return grade;
    }

    public String getDesignation() {
        return designation;
    }

    private static EmployeeSingleton employeeSingleton = null;

    public EmployeeSingleton getInstance() {
        if(employeeSingleton == null)
            employeeSingleton = new EmployeeSingleton();
        return employeeSingleton;
    }
    private EmployeeSingleton() {

    }

}