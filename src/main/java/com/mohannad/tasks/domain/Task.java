package com.mohannad.tasks.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 * create by mohannad on 10/9/2019
 */
@Entity
public class Task {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @JsonFormat(pattern = "mm/dd/yyyy")
    private LocalDate dueDate;
    private Boolean completed ;

    public Task(String name, LocalDate dueDate, Boolean completed) {
        this.name = name;
        this.dueDate = dueDate;
        this.completed = completed;
    }

    public Task() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @JsonIgnore
    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
