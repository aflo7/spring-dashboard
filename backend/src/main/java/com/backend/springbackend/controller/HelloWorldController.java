
package com.backend.springbackend.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import java.util.Map;
import java.util.HashMap;

@RestController
public class HelloWorldController {
    
    
    @GetMapping("/api/hello")
    public Map<String, String> HelloWorld() {
        HashMap<String, String> res = new HashMap<>();
        res.put("message", "Hello world");
        return res;
        
    }
}
