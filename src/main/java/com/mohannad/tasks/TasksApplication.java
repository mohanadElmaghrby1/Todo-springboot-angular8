package com.mohannad.tasks;

import com.mohannad.tasks.domain.Task;
import com.mohannad.tasks.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class TasksApplication {

    public static void main(String[] args) {
        SpringApplication.run(TasksApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(TaskService taskService){
        return args -> {
          taskService.save(new Task("create spring boot app" , LocalDate.now() , true));
          taskService.save(new Task("create spring boot angular" , LocalDate.now().plus(1,ChronoUnit.DAYS) , false));
          taskService.save(new Task("angular course" , LocalDate.now().plus(2,ChronoUnit.DAYS) , false));
        };
    }
}
