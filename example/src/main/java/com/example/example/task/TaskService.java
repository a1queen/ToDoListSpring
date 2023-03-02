package com.example.example.task;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import static org.springframework.http.ResponseEntity.status;

@Service
public class TaskService {


    private TaskRepository taskRepository;
    @Autowired
    TaskService (TaskRepository taskRepository){
        this.taskRepository= taskRepository;
    }
    public Task getSingleTask( long id){
        return taskRepository.findById(id).orElseThrow();
    }

    public ResponseEntity<Task> addTask( Task task) {
        taskRepository.save(task);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(task);
    }

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    public ResponseEntity<Void> deleteTask(Long id) {
taskRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
