package com.example.todolist3.controllers;


import com.example.todolist3.MyTask;
import com.example.todolist3.services.ToDoListService;
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
    public ResponseEntity<List<MyTask>> getProducts() {
        return service.getAllProducts();
    }

    @PostMapping
    public ResponseEntity<MyTask> addProduct(@RequestBody JSONObject object) {
        return service.addProduct(object);
    }

}
