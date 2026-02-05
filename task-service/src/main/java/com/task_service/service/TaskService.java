package com.task_service.service;

import com.task_service.model.Task;
import com.task_service.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository repo;

    public TaskService(TaskRepository repo) {
        this.repo = repo;
    }

    public List<Task> getAll() {
        return repo.findAll();
    }

    public Task getById(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public Task save(Task task) {
        return repo.save(task);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
