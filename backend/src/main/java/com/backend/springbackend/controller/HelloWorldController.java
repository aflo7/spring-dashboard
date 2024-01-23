package com.backend.springbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.HashMap;
import classes.Employee;

@RestController
public class HelloWorldController {

    @GetMapping("/api/employees/all")
    public Map<String, Employee[]> HelloWorld() {
        Employee employee1 = new Employee("Santo Cannone", "VP, Contracts & Legal Services", "Finance", 1);
        Employee employee2 = new Employee("Sharon", "Senior Vice President", "Finance", 2);
        Employee employee3 = new Employee("David Mitchell", "Director of Accounting", "Finance", 3);
        Employee employee4 = new Employee("Jennifer Lopez", "HR Manager", "Human Resources", 4);
        Employee employee5 = new Employee("Michael Turner", "Research Scientist", "Research and Development", 5);
        Employee employee6 = new Employee("Lisa Smith", "Marketing Manager", "Marketing", 6);
        Employee employee7 = new Employee("Robert Johnson", "IT Specialist", "Information Technology", 7);
        Employee employee8 = new Employee("Catherine Williams", "Operations Manager", "Operations", 8);
        Employee employee9 = new Employee("George Davis", "Sales Director", "Sales", 9);
        Employee employee10 = new Employee("Emily White", "Product Manager", "Product Management", 10);
        Employee employee11 = new Employee("Thomas Anderson", "Engineering Lead", "Engineering", 11);
        Employee employee12 = new Employee("Sophia Clark", "Customer Support Specialist", "Customer Support", 12);
        Employee employee13 = new Employee("William Martin", "Quality Assurance Analyst", "Quality Assurance", 13);
        Employee employee14 = new Employee("Olivia Harris", "Supply Chain Manager", "Supply Chain", 14);
        Employee employee15 = new Employee("John Taylor", "Public Relations Officer", "Public Relations", 15);
        Employee employee16 = new Employee("Samantha Miller", "Legal Counsel", "Legal", 16);
        Employee employee17 = new Employee("Daniel Brown", "Creative Director", "Creative", 17);
        Employee employee18 = new Employee("Ava Wilson", "Facilities Manager", "Facilities", 18);
        Employee employee19 = new Employee("James Hall", "Research Analyst", "Research and Development", 19);
        Employee employee20 = new Employee("Ella Green", "Event Coordinator", "Events", 20);
        Employee employee21 = new Employee("Charles King", "Business Development Manager", "Business Development", 21);
        Employee employee22 = new Employee("Charles King", "Business Development Manager", "Business Development", 22);
        Employee employee23 = new Employee("Mia Adams", "Customer Relations Specialist", "Customer Relations", 23);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5, employee6, employee7, employee8, employee9, employee10, employee11, employee12, employee13, employee14, employee15, employee16, employee17, employee18, employee19, employee20, employee21, employee22, employee23};

        HashMap<String, Employee[]> res = new HashMap<>();
        res.put("employeeArr", employees);
        return res;

    }
}
