package com.task.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.dao.TaskDao;
import com.task.model.Task;
@Service
public class TaskServiceImp implements TaskService {
	@Autowired
	TaskDao dao;
	
	@Override
	public List<Task> getAllTasks() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Task getTaskById(int id) {
		// TODO Auto-generated method stub
		Optional<Task> task=dao.findById(id);
		return task.get();
	}

	@Override
	public Task insertTask(Task t) {
		// TODO Auto-generated method stub
		return dao.save(t);
	}

	@Override
	public Task  updateTask(Task t) {
		// TODO Auto-generated method stub
		Optional<Task> req=dao.findById(t.getId());
		Task  task=req.get();
		task.setStatus(t.getStatus());
		return dao.save(task);
	}

	@Override
	public void deleteTask(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}
}
