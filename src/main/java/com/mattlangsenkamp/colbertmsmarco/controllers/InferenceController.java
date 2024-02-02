package com.mattlangsenkamp.colbertmsmarco.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
@CrossOrigin
public class InferenceController {

    @GetMapping("/")
    public String info() {
        return "A search engine built with Spring Boot, NVIDIA Triton, gRPC and jvector";
    }

    @PostMapping("/infer")
    public List<String> infer(@RequestBody String info) {
        return List.of("one two three");
    }
}
