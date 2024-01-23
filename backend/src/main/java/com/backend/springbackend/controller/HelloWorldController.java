
package com.backend.springbackend.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import java.util.Map;
import java.util.HashMap;
import classes.Employee;

//const employeesArr = [
//  {
//    name: 'Michael Turner',
//    designation: 'Research Scientist',
//    department: 'Research & Development',
//    id: 2188
//  },
//  {
//    name: 'Lisa Smith',
//    designation: 'Marketing Manager',
//    department: 'Marketing',
//    id: 2189
//  },
//  {
//    name: 'Robert Johnson',
//    designation: 'IT Specialist',
//    department: 'Information Technology',
//    id: 2190
//  },
//  {
//    name: 'Catherine Williams',
//    designation: 'Operations Manager',
//    department: 'Operations',
//    id: 2191
//  },
//  {
//    name: 'George Davis',
//    designation: 'Sales Director',
//    department: 'Sales',
//    id: 2192
//  },
//  {
//    name: 'Emily White',
//    designation: 'Product Manager',
//    department: 'Product Management',
//    id: 2193
//  },
//  {
//    name: 'Thomas Anderson',
//    designation: 'Engineering Lead',
//    department: 'Engineering',
//    id: 2194
//  },
//  {
//    name: 'Sophia Clark',
//    designation: 'Customer Support Specialist',
//    department: 'Customer Support',
//    id: 2195
//  },
//  {
//    name: 'William Martin',
//    designation: 'Quality Assurance Analyst',
//    department: 'Quality Assurance',
//    id: 2196
//  },
//  {
//    name: 'Olivia Harris',
//    designation: 'Supply Chain Manager',
//    department: 'Supply Chain',
//    id: 2197
//  },
//  {
//    name: 'John Taylor',
//    designation: 'Public Relations Officer',
//    department: 'Public Relations',
//    id: 2198
//  },
//  {
//    name: 'Samantha Miller',
//    designation: 'Legal Counsel',
//    department: 'Legal',
//    id: 2199
//  },
//  {
//    name: 'Daniel Brown',
//    designation: 'Creative Director',
//    department: 'Creative',
//    id: 2200
//  },
//  {
//    name: 'Ava Wilson',
//    designation: 'Facilities Manager',
//    department: 'Facilities',
//    id: 2201
//  },
//  {
//    name: 'James Hall',
//    designation: 'Research Analyst',
//    department: 'Research & Development',
//    id: 2202
//  },
//  {
//    name: 'Ella Green',
//    designation: 'Event Coordinator',
//    department: 'Events',
//    id: 2203
//  },
//  {
//    name: 'Charles King',
//    designation: 'Business Development Manager',
//    department: 'Business Development',
//    id: 2204
//  },
//  {
//    name: 'Mia Adams',
//    designation: 'Customer Relations Specialist',
//    department: 'Customer Relations',
//    id: 2205
//  }
//];

@RestController
public class HelloWorldController {
    
    
    @GetMapping("/api/employees")
    public Map<String, Employee[]> HelloWorld() {
        Employee employee1 = new Employee("Santo Cannone", "VP, Contracts & Legal Services", "Finance", 1);
        Employee employee2 = new Employee("Sharon", "Senior Vice President", "Finance", 2);
        Employee employee3 = new Employee("David Mitchell", "Director of Accounting", "Finance", 3);
        Employee employee4 = new Employee("Jennifer Lopez","HR Manager","Human Resources",4);
        Employee[] employees = {employee1, employee2, employee3, employee4};
        
        HashMap<String, Employee[]> res = new HashMap<>();
        res.put("employeeArr", employees);
        return res;
        
    }
}
