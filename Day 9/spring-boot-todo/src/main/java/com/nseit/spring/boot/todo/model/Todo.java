package com.nseit.spring.boot.todo.model;
import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Todo {
    private int id;
    private String name;
    boolean isCompleted;

}
