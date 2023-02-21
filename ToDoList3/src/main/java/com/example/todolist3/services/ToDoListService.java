package com.example.todolist3.services;

import com.example.todolist3.MyTask;
import com.example.todolist3.repositories.ModelRepository;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoListService {


    private final ModelRepository repository;

    @Autowired
    ToDoListService(ModelRepository repository) {
        this.repository = repository;
    }




    public ResponseEntity<List<MyTask>> getAllProducts() {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(repository.findAll());
    }


    public ResponseEntity<MyTask> addProduct(JSONObject object) {
        MyTask added = new MyTask(object.get("title").toString(), object.get("description").toString(), Integer.parseInt(object.get("priority").toString()), object.get("date").toString());
        repository.save(added);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(added);
    }

}
