package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class AgeCheckerService {

    public String checkAge(int age) {
        if (age >= 18) {
            return "Tu eres un adulto";
        } else {
            return "Tu no eres un adulto";
        }
    }
}


