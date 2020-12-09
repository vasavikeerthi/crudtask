package com.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task.model.Task;
import com.task.service.TaskService;
@RestController
@RequestMapping("/")
public class TaskController {
	@Autowired
	TaskService service;
	
	@GetMapping("/tasks")
	public List<Task> getAllTasks(){
		return service.getAllTasks();
	}
	
	@GetMapping("/tasks/{id}")
	public Task getTaskById(@PathVariable int id){
		return service.getTaskById(id);
	}
	
	@PostMapping("/tasks")
	public Task insertTask(@RequestBody Task t) {
		return service.insertTask(t);
	}
	
	@PutMapping("/tasks")
	public Task updateTask(@RequestBody Task t) {
		return service.updateTask(t);
	}
	
	@GetMapping("/tasks/afterDelete/{id}")
	public List<Task> deleteTask(@PathVariable int id){
		service.deleteTask(id);
		return service.getAllTasks();
	}

}
