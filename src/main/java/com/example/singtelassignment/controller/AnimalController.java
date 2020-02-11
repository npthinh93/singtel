package com.example.singtelassignment.controller;

import com.example.singtelassignment.model.Animal;
import com.example.singtelassignment.model.Dog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("")
public class AnimalController {

    @GetMapping(value = "/api/dog")
    public CompletableFuture<Animal> getDog() {
        return CompletableFuture.completedFuture(new Dog());
    }
}
