package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.AgeCheckerService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/age")
public class AgeCheckerController {
    @Autowired
    private AgeCheckerService ageCheckerService;

    @GetMapping("/check")
    public String checkAge(@RequestParam int age) {
        return ageCheckerService.checkAge(age);
    }
}
