package com.example.todolist3.repositories;


import com.example.todolist3.MyTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository extends JpaRepository <MyTask, Long> {



}
