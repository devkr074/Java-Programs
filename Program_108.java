import java.io.*;
import java.util.*;

class Task implements Serializable {
    private String title;
    private String description;
    private boolean done;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.done = false;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return done;
    }

    public void markDone() {
        this.done = true;
    }

    @Override
    public String toString() {
        return (done ? "[✔]" : "[ ]") + " " + title + " - " + description;
    }
}

class ToDoList {
    private List<Task> tasks = new ArrayList<>();
    private final String FILE_NAME = "tasks.dat";

    public ToDoList() {
        loadTasks();
    }

    public void addTask(Task t) {
        tasks.add(t);
        saveTasks();
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public void markTaskDone(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markDone();
            System.out.println("Task marked as done.");
            saveTasks();
        } else {
            System.out.println("Invalid task number!");
        }
    }

    public void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Task deleted.");
            saveTasks();
        } else {
            System.out.println("Invalid task number!");
        }
    }

    private void saveTasks() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(tasks);
        } catch (IOException e) {
            System.out.println("Error saving tasks.");
        }
    }

    @SuppressWarnings("unchecked")
    private void loadTasks() {
        File file = new File(FILE_NAME);
        if (!file.exists())
            return;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            tasks = (List<Task>) ois.readObject();
        } catch (Exception e) {
            System.out.println("Error loading tasks.");
        }
    }
}

public class Program_108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ToDoList todo = new ToDoList();
        while (true) {
            System.out.println("\n=== To-Do List Menu ===");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Done");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter task description: ");
                    String desc = sc.nextLine();
                    todo.addTask(new Task(title, desc));
                    break;
                case 2:
                    todo.viewTasks();
                    break;
                case 3:
                    todo.viewTasks();
                    System.out.print("Enter task number to mark as done: ");
                    int doneIndex = sc.nextInt() - 1;
                    todo.markTaskDone(doneIndex);
                    break;
                case 4:
                    todo.viewTasks();
                    System.out.print("Enter task number to delete: ");
                    int delIndex = sc.nextInt() - 1;
                    todo.deleteTask(delIndex);
                    break;
                case 5:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}