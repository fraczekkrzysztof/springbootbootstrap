package com.fraczekkrzysztof.springbootbootstrap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fraczekkrzysztof.springbootbootstrap.service.TaskService;

@RestController
public class RestControllerExample {
	
	
	@Autowired
	private TaskService taskService;
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello from Rest Controller!";
	}
	@GetMapping("/api/all-tasks")
	public String allTasks() {
		return taskService.findAll().toString();
	}
}
