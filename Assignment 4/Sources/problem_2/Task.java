package problem_2;

public class Task implements Priority
{
    String taskName;
    String taskDescription;
    Priority.Level priorityLevel;

    public Task(String taskName, String taskDescription)
    {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
    }

    public String getName()
    {
        return taskName;
    }

    public String getDescription()
    {
        return taskDescription;
    }

    public void setPriority(Level priorityLevel)
    {
        this.priorityLevel = priorityLevel;
    }

    @Override
    public Level getPriority()
    {
        return priorityLevel;
    }
}
