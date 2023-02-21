package com.example.todos.services;

import com.example.todos.models.Model;
import com.example.todos.repositories.ModelRepository;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoListService {


    private  ModelRepository repository;

    @Autowired
    ToDoListService(ModelRepository repository) {
        this.repository = repository;
    }




    public ResponseEntity<List<Model>> getAllProducts() {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(repository.findAll());
    }


    public ResponseEntity<Model> addProduct(JSONObject object) {
        Model added = new Model(object.get("title").toString(), object.get("description").toString(), Integer.parseInt(object.get("priority").toString()), object.get("date").toString());
        repository.save(added);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(added);
    }


}
