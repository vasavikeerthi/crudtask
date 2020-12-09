package com.task.service;

import java.util.List;

import com.task.model.Task;

public interface TaskService {
	public List<Task> getAllTasks();

	public Task getTaskById(int id);

	public Task insertTask(Task t);

	public Task updateTask(Task t);

	public void deleteTask(int id);
}
