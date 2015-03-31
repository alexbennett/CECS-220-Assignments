package problem_2;

interface Priority
{
    enum Level { HIGH, MEDIUM, LOW }

    void setPriority(Level priorityLevel);
    Level getPriority();
}
