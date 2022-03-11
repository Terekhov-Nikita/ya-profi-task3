package com.example.task2.controller;


import com.example.task2.model.Participant;
import com.example.task2.repository.ExampleRepository;
import com.example.task2.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/products")
public class ExampleController {

    @Autowired
    private ExampleRepository exampleRepository;

    ExampleService exampleService;

    public ExampleController(ExampleService exampleService){
        this.exampleService=exampleService;
    }

    @PostMapping
    public ResponseEntity<Participant> addDescription(String name, String description, Long categoryId){

        return null;
    }

    @GetMapping
    public ResponseEntity<List<Participant>> getProductsList(Long id, Long categoryId, String name, String description){
        return null;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Participant> getProduct(Long id){
        return null;
    }

    @PutMapping(value = "/{id}")
    public void update(Long id,Long categoryId,String name,String description){

    }

    @GetMapping
    public ResponseEntity<List<Participant>> getSorted(@RequestParam(name="category_id", required = false) long id){
        return null;
    }

    @DeleteMapping(value = "/{id}")
    public void delete(Long id){

    }


}
