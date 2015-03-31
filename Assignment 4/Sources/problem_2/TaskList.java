package problem_2;

import java.util.ArrayList;

public class TaskList
{
    public static void main(String... args)
    {
        // Create task list
        ArrayList<Task> tasks = new ArrayList<Task>();

        // Create tasks
        Task task1 = new Task("Water the plants", "Water the plants fool");
        task1.setPriority(Priority.Level.HIGH);

        Task task2 = new Task("Pick up the kids", "Don't forget those kiddos");
        task2.setPriority(Priority.Level.LOW);

        Task task3 = new Task("Mow the lawn", "Better find the scissors");
        task3.setPriority(Priority.Level.MEDIUM);

        // Add to list
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);

        // Display information
        for(Task task : tasks)
        {
            System.out.println("Name: " + task.getName());
            System.out.println("Description: " + task.getDescription());
            System.out.println("Priority: " + task.getPriority() + "\n");
        }
    }
}
