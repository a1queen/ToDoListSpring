package com.example.todos.repositories;

import com.example.todos.models.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


    @Repository
    public interface ModelRepository extends JpaRepository<Model, Long> {
    }

