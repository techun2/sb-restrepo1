package com.sb.restsimple2.RestPrjSimple2.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api2")
public class TodoController {
	public static final List<Todo> TODO_LIST = 
			List.of(new Todo("user1", "Buy Grocery"),
					new Todo("user2", "Pay Bills"),
					new Todo("user1", "Travel to office"));
	
	@GetMapping("/todo/{idx}")
	public Todo getTodoForUser(@PathVariable int idx) {
		return TODO_LIST.get(idx);
	}

	@PostMapping("/todo/{username}/todos")
	public void createTodoForUser(@PathVariable String username, 
			@RequestBody Todo todo) {
		System.out.println("Create  for " + username+" " +todo);
	}
}

record Todo(String user, String desc) {}
