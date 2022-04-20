package com.example.first;

import com.dumpclasses.Employee;
import com.dumpclasses.EmployeeDatabase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Spring Boot";
    }

    @GetMapping("/reduce")
    public String reduce() {
        List<Integer> integers = Arrays.asList(10,20,50);
        Integer sum = integers.stream()
                .reduce((a, b) -> a+b)
                .get();

        System.out.println("Sum using reduce method " + sum);


        List<String> strings = Arrays.asList("Core Java", "HIbernate");
        String longestString  = strings
                .stream()
                .reduce((str1, str2) -> str1.length() > str2.length() ? str1 : str2)
                .get();
        System.out.println("Longest String : " + longestString);

        Double averageSalary = EmployeeDatabase.employeeList.stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .average()
                .getAsDouble();
        System.out.println("Average Salary : " + averageSalary);

        return "Welcome to Spring Boot";
    }

    @GetMapping("/optional")
    public String optional() {
        Employee employee = new Employee(null, "A", "Manager");
        Optional<Object> nullSalaryOptional = Optional.ofNullable(employee.getSalary());
        Optional<String> designationOptional = Optional.ofNullable(employee.getDesignation());
        System.out.println(designationOptional
                .map(String::toUpperCase)
                .orElseGet(()->"Some default designation"));


        return "Welcome to Spring Boot";
    }


    @GetMapping("/testPolymorphish")
    public String poly() {
        Employee employee = new Employee(null, "A", "Manager");
        Optional<Object> nullSalaryOptional = Optional.ofNullable(employee.getSalary());
        Optional<String> designationOptional = Optional.ofNullable(employee.getDesignation());
        System.out.println(designationOptional
                .map(String::toUpperCase)
                .orElseGet(()->"Some default designation"));


        return "Welcome to Spring Boot";
    }
}
