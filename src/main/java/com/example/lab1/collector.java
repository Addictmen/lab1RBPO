
package com.example.lab1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class collector {

    @GetMapping("/hello")
    public String hello() {
        return "Привет, мир!";
    }

    @GetMapping("/number")
    public int number() {
        return 12;
    }
}
