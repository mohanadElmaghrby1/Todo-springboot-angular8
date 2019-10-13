package com.mohannad.tasks.service;

import com.mohannad.tasks.domain.Task;
import com.mohannad.tasks.repository.TaskRepository;
import org.springframework.stereotype.Service;

/**
 * create by mohannad on 10/9/2019
 */
@Service
public class TaskServiceImpl implements TaskService{

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> list() {
        return taskRepository.findAll();
    }

    @Override
    public Task save(Task task) {
        return taskRepository.save(task);
    }
}
