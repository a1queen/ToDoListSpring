package com.example.todolist3;


import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;

//@Data
@Entity
//@Table(name = "Tasks")
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@RequiredArgsConstructor
public class MyTask {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private final String title;
private final String description;
private final Integer priority;
private final String date;
}
