package com.example.todos.controllers;

import com.example.todos.models.Model;
import com.example.todos.services.ToDoListService;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


    @CrossOrigin("*")
    @RestController
    @RequestMapping("/task")


    public class ModelController {

        ToDoListService service;


        @Autowired
        ModelController (ToDoListService service){
            this.service=service;
        }

        @GetMapping
        public ResponseEntity<List<Model>> getProducts() {
            return service.getAllProducts();
        }

        @PostMapping
        public ResponseEntity<Model> addProduct(@RequestBody JSONObject object) {
            return service.addProduct(object);
        }

    }

