package com.example.model;

import java.time.LocalDateTime;

public class Todo {

	private String title;
	private String description;
	private LocalDateTime createdAt;
	
	public Todo() {
	}
	

	public Todo(String title, String description) {
		super();
		this.title = title;
		this.description = description;
		this.createdAt = LocalDateTime.now();
	}



	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Todo [title=" + title + ", description=" + description + ", createdAt=" + createdAt + "]";
	}
	
}
