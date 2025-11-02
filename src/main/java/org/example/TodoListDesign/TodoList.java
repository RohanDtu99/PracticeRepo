package org.example.TodoListDesign;

import java.util.ArrayList;
import java.util.List;

public class TodoList{
   List<Task> tasks;
   int counter ;
   TodoList(){
       this.tasks = new ArrayList<>();
   }

   // Addding task into todoList
    public void addTask(String description){
       Task task = new Task(counter++, description );
       tasks.add(task);
       System.out.println("Task added successfully: " + task);
    }

    public void deleteTask(int id){
       for(Task task : tasks){
           if(task.getId() == id){
               tasks.remove(task);
               System.out.println("Task Deleted successfully: " + task);
           }
       }
    }

    // mark status completed
    public void markCompleted(int id){
        for(Task task : tasks){
            if(task.getId() == id){
                task.markCompleted();
                System.out.println("Task Deleted successfully: " + task);
            }
        }
    }

    public void markInComplete(int id){
       for(Task task : tasks){
           if(task.getId() == id){
               task.markIncomplete();
           }
       }
    }

    // update description
    public void updateDetails(int id,String description){
       for(Task task : tasks){
           if(task.getId() == id){
               task.setDescription(description);
           }
       }
    }


    // Display all tasks in the to-do list
    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available in the to-do list.");
            return;
        }
        System.out.println("List of tasks:");
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

}
