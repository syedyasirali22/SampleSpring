package com.dumpclasses;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Employee {
    

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Employee(Double salary) {
        this.salary = salary;
    }


    private Double salary;
    private String grade;
    private String designation;

    public Employee(Double salary, String grade) {
        this.salary = salary;
        this.grade = grade;
    }

    public Employee(Double salary, String grade, String designation) {
        this.salary = salary;
        this.grade = grade;
        this.designation = designation;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}