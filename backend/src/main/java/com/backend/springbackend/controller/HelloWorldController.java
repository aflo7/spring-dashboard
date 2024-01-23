package com.backend.springbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.HashMap;
import classes.Employee;
import classes.StoredEmployees;

@RestController
public class HelloWorldController {

    @GetMapping("/api/employees/all")
    public Map<String, Employee[]> HelloWorld() {
        StoredEmployees employees = new StoredEmployees();
        HashMap<String, Employee[]> res = new HashMap<>();
        res.put("employeeArr", employees.getAllEmployees());
        return res;
    }
}
