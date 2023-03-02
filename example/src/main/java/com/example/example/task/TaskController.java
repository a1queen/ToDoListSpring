package com.example.example.task;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@CrossOrigin(origins = "*")
@RequestMapping("/task")
public class TaskController {

    private final TaskService taskService;


    TaskController(TaskService taskService){
        this.taskService=taskService;
    }
    @PostMapping
    public ResponseEntity<Task> postTask(@RequestBody Task task){
        return taskService.addTask(task);
    }

    @GetMapping
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();
    }

    @GetMapping("/{id}")
    public Task getSingleTask(@PathVariable long id){
        return taskService.getSingleTask(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id){
        return taskService.deleteTask(id);
    }


}
