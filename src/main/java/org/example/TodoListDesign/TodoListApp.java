package org.example.TodoListDesign;

import java.util.Scanner;

public class TodoListApp {
    public static void main(String[] args) {
        TodoList toDoList = new TodoList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- To-Do List Menu ---");
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task as Completed");
            System.out.println("3. Mark Task as Incomplete");
            System.out.println("4. Delete Task");
            System.out.println("5. View All Tasks");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline after integer input

            switch (option) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    toDoList.addTask(description);
                    break;
                case 2:
                    System.out.print("Enter task ID to mark as completed: ");
                    int completedId = scanner.nextInt();
                    toDoList.markCompleted(completedId);
                    break;
                case 3:
                    System.out.print("Enter task ID to mark as incomplete: ");
                    int incompleteId = scanner.nextInt();
                    toDoList.markInComplete(incompleteId);
                    break;
                case 4:
                    System.out.print("Enter task ID to delete: ");
                    int deleteId = scanner.nextInt();
                    toDoList.deleteTask(deleteId);
                    break;
                case 5:
                    toDoList.displayTasks();
                    break;
                case 6:
                    System.out.println("Exiting application. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
