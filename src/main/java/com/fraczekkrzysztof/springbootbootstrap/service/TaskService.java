package com.fraczekkrzysztof.springbootbootstrap.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fraczekkrzysztof.springbootbootstrap.dao.TaskRepository;
import com.fraczekkrzysztof.springbootbootstrap.entity.Task;

@Service
@Transactional
public class TaskService {

	private final TaskRepository taskRepository;

	public TaskService(TaskRepository taskRepository) {
		super();
		this.taskRepository = taskRepository;
	}
	
	public List<Task> findAll(){
		List<Task> tasks = new ArrayList<>();
		for(Task task: taskRepository.findAll()) {
			tasks.add(task);
		}
		return tasks;
	}
	
}
