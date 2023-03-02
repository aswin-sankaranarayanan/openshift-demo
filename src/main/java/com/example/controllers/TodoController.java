package com.example.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	private static final  Logger logger = LoggerFactory.getLogger(TodoController.class);

	@Autowired
	private TodoService todoService;
	
	@GetMapping("/test/")
	public String getVersion(){
		return "APP Version 1";
	}

	@GetMapping
	public ResponseEntity<List<Todo>> findAll(){
		List<Todo> todos = todoService.getAllTodos();
		logger.info("-----Retrieved AllTodos---> "+ todos);
		return ResponseEntity.ok(todos);
	}
}
