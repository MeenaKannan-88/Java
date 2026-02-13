package com.springboot.calculations.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import tools.jackson.databind.JsonNode;

@Component
public class CalculationsService {

    public int addition(int a, int b){
        int result = a+b;
        System.out.println("Addition :" + result );
        return result;
    }

    public int subtraction(int a, int b){
        int result = a-b;
        System.out.println("Subtraction :" + result );
        return result;
    }

    public int multiplication( int a,  int b){
        int result = a*b;
        System.out.println("Multiplication :" + result );
        return result;
    }

    public int division(JsonNode node ) {

        int a = node.get("a").asInt();
        int b = node.get("b").asInt();
        return (int) a / b;    }
}
