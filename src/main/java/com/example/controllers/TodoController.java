package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Todo;
import com.example.service.TodoService;

@RestController
@RequestMapping("/api/todos")
public class TodoController {
	
	@Autowired
	private TodoService todoService;

	@GetMapping
	public ResponseEntity<List<Todo>> findAll(){
		List<Todo> todos = todoService.getAllTodos();
		return ResponseEntity.ok(todos);
	}
}
