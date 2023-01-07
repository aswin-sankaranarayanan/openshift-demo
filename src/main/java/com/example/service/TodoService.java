package com.example.service;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.example.model.Todo;

@Service
public class TodoService {
	
	private static final  Logger logger = LoggerFactory.getLogger(TodoService.class);

	public List<Todo> getAllTodos(){
		logger.info("-----Inside getAllTodos---");
		Todo todo1 = new Todo("Todo1", "Todo1 Description");
		Todo todo2 = new Todo("Todo2", "Todo2 Description");
		
		return Arrays.asList(todo1,todo2);
	}
}
