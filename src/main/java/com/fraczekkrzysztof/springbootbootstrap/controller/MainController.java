package com.fraczekkrzysztof.springbootbootstrap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fraczekkrzysztof.springbootbootstrap.service.TaskService;

@Controller
public class MainController {

	@Autowired
	private TaskService taskService;
	
	@RequestMapping("/")
	public String hello() {
		return "index";
	}
}
