package com.mohannad.tasks.repository;

import com.mohannad.tasks.domain.Task;
import org.springframework.data.repository.CrudRepository;

/**
 * create by mohannad on 10/9/2019
 */
public interface TaskRepository extends CrudRepository<Task, Long> {
}
