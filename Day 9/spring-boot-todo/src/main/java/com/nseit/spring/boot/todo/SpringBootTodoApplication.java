package com.nseit.spring.boot.todo;

import com.nseit.spring.boot.todo.model.Todo;
import com.nseit.spring.boot.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class SpringBootTodoApplication implements CommandLineRunner {
	@Autowired
private TodoService todoService;

	public static void main(String[] args) {

		SpringApplication.run(SpringBootTodoApplication.class, args);
	}@Override
	public void run(String...args) throws Exception{
		Todo todo1=new Todo(1,"abcd",false);
		Todo todo2=new Todo(2,"efgh",false);
		Todo todo3=new Todo(3,"ijkl",false);
		todoService.addTodo(todo1);
		todoService.addTodo(todo2);
		todoService.addTodo(todo3);

		todoService.viewTodo();
		todoService.updateTodo(1);
		todoService.updateTodo(2);



		}
	}



