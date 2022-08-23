package com.nseit.spring.boot.todo.repository;

import com.nseit.spring.boot.todo.model.Todo;
import lombok.Getter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Getter
@Repository

public class TodoRepository {
    private ArrayList<Todo> todos = new ArrayList<Todo>();
}
