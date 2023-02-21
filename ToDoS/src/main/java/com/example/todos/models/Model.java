package com.example.todos.models;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@RequiredArgsConstructor
public class Model {

    private Long id;
    private final String title;
    private final String description;
    private final Integer priority;
    private final String date;
}

