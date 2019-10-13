package com.mohannad.tasks.service;

import com.mohannad.tasks.domain.Task;

public interface TaskService {
    Iterable<Task>list();
    Task save(Task task);
}
