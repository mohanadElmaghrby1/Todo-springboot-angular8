import {Component, OnInit} from '@angular/core';
import {Task} from "../task,model";

@Component({
  selector: 'app-tasks-list',
  templateUrl: './tasks-list.component.html',
  styleUrls: ['./tasks-list.component.css']
})
export class TasksListComponent implements OnInit {

  tasks: Task[] = [];

  constructor() {
  }

  ngOnInit() {
    this.tasks.push(new Task(1, "task1", false, "07/08/2019"))
    this.tasks.push(new Task(2, "task2", true, "07/08/2020"))
    this.tasks.push(new Task(3, "task3", true, "07/08/2021"))
  }

  onTaskChange($event: Event, task: Task) {
    console.log(task.name +" changed ,"+task.completed)
  }

  getDueDateLabel(task: Task) {
    return task.completed ? 'label-success' : 'label-primary';
  }
}
