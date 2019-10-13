import { HttpClient } from '@angular/common/http';
import {EventEmitter, Injectable} from "@angular/core";
import {Task} from "./task,model";

@Injectable()
export class TaskService {

  // Add EventEmitter for connect tass-add to task0list
  onTaskAdded = new EventEmitter<Task>()

  constructor(private http:HttpClient){
  }

  getTasks( ){
    return this.http.get('/api/tasks');
  }

  saveTask(task :Task , completed : boolean){
    task.completed=completed;
    return this.http.post('/api/tasks/save' , task);
  }

  addTask(task :Task){
    console.log("create new task " +task.name );
    return this.http.post('/api/tasks/save' , task);
  }
}
