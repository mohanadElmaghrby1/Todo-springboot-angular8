package com.mohannad.tasks.controller;

import com.mohannad.tasks.domain.Task;
import com.mohannad.tasks.service.TaskService;
import net.bytebuddy.asm.Advice;
import org.springframework.web.bind.annotation.*;

/**
 * create by mohannad on 10/9/2019
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value = {"","/"})
    public Iterable<Task> list(){
        System.out.println("calllled");
        return taskService.list();
    }

    @PostMapping("/save")
    public Task saveTask(@RequestBody Task task){
        return taskService.save(task);
    }
}
