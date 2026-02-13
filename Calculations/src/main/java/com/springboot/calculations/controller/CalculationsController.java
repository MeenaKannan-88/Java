package com.springboot.calculations.controller;

import com.springboot.calculations.service.CalculationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import tools.jackson.databind.JsonNode;

@Component
@RestController
@RequestMapping("/calculations")
public class CalculationsController {

    @Autowired
    private CalculationsService service;

    @GetMapping("/addition")
    public int addition(@RequestParam int a, @RequestParam int b){
        int addition = service.addition(a,b);
        return addition;
    }

    @GetMapping("/subtraction/{a}/{b}")
    public int subtraction(@PathVariable int a, @PathVariable int b){
        int result = service.subtraction(1,b);
        System.out.println("Subtraction :" + result );
        return result;
    }

    @PostMapping("/multiplication/{a}/{b}")
    public int multiplication(@PathVariable int a, @PathVariable int b){
        int result = service.multiplication(a,b);
        System.out.println("Multiplication :" + result );
        return result;
    }

    @PostMapping("/division")
    public int division(@RequestBody JsonNode node) {
        int result = service.division(node);
        return result;
    }
}
