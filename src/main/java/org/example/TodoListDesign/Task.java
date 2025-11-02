package org.example.TodoListDesign;

public class Task {
    private int id;
    private String description;
    private boolean status;
    Task(int id , String description){
        this.id = id;
        this.description = description;
        this.status = false ;  // default status is false for completion of task
    }

    public int getId(){
        return id;
    }
    public String getDescription(){
        return description;
    }

    public boolean getStatus(){
        return status;
    }

    // set description
    public void setDescription(String description){
        this.description = description;
    }

    // set task has completed
    public void markCompleted(){
        this.status = true;
    }

    // set status inComplete
    public void markIncomplete() {
        this.status = false;
    }

    @Override
    public String toString() {
        return "Task{id= " + id + ", description=' " + description + '\'' +
                ", status= " + (status ? "Completed" : "Pending") + '}';
    }
}

