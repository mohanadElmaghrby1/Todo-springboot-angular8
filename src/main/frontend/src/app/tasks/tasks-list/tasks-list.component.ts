import {Component, OnInit} from '@angular/core';
import {Task} from "../task,model";
import {TaskService} from "../task.service";

@Component({
  selector: 'app-tasks-list',
  templateUrl: './tasks-list.component.html',
  styleUrls: ['./tasks-list.component.css']
})
export class TasksListComponent implements OnInit {

  tasks: Task[] = [];

  constructor(private taskService: TaskService) {
  }

  ngOnInit() {
    this.taskService.getTasks().subscribe(
      (tasks: any[]) => {
        this.tasks=tasks;
      },
      (error) => console.log(error)
    );
    // this.tasks.push(new Task(1, "task1", false, "07/08/2019"))
    // this.tasks.push(new Task(2, "task2", true, "07/08/2020"))
    // this.tasks.push(new Task(3, "task3", true, "07/08/2021"))
    //subscribe onTaskAdded Emitter
    this.taskService.onTaskAdded.subscribe(
      (task : Task)=>this.tasks.push(task)
    );
  }

  onTaskChange(event , task) {
    this.taskService.saveTask(task , event.target.checked).subscribe();
    console.log(task.name + " changed ," + task.completed)
  }

  getDueDateLabel(task: Task) {
    return task.completed ? 'label-success' : 'label-primary';
  }
}
