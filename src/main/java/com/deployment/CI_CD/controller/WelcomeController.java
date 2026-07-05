package com.deployment.CI_CD.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/welcome")
public class WelcomeController {
    @GetMapping
    public ResponseEntity<String> welcome(){
        return new ResponseEntity<>("Welcome to CI CD", HttpStatus.OK);
    }
    @GetMapping("/a")
    public ResponseEntity<String> godbye(){
        return new ResponseEntity<>("goodbye to CI CD", HttpStatus.OK);
    }
}
