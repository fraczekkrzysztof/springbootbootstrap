package com.fraczekkrzysztof.springbootbootstrap.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fraczekkrzysztof.springbootbootstrap.entity.Task;
import com.fraczekkrzysztof.springbootbootstrap.service.TaskService;

@RestController
@RequestMapping("/api")
public class RestControllerExample {
	
	
	@Autowired
	private TaskService taskService;
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello from Rest Controller!";
	}
	@GetMapping("/all-tasks")
	public String allTasks() {
		return taskService.findAll().toString();
	}
	@GetMapping("/save-task")
	public String saveTask(@RequestParam String name, @RequestParam String desc) {
		Task task = new Task(name, desc,new Date(),false);
		taskService.save(task);
		return "Task saved";
	}
	@GetMapping("/delete-task")
	public String deleteTask(@RequestParam int id) {
		taskService.delete(id);
		return "Task deleted";
	}
}
