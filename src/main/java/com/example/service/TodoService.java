package com.example.service;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.model.Todo;

@Service
public class TodoService {

	public List<Todo> getAllTodos(){
		Todo todo1 = new Todo("Todo1", "Todo1 Description");
		Todo todo2 = new Todo("Todo2", "Todo2 Description");
		
		return Arrays.asList(todo1,todo2);
	}
}
