package com.task_service.controller;

import com.task_service.model.Task;
import com.task_service.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @GetMapping
    public List<Task> all() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Task one(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Task create(@RequestBody Task task) {
        return service.save(task);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}