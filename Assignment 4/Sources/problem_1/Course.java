package problem_1;

import java.util.ArrayList;

public class Course
{
    String courseName;
    ArrayList<Student> students;

    public Course(String courseName)
    {
        // Set course name
        this.courseName = courseName;

        // Create student ArrayList
        students = new ArrayList<Student>();
    }

    public void addStudent(Student student)
    {
        students.add(student);
    }

    public void average()
    {
        double average = 0;

        for(Student student : students)
        {
            average += student.average();
        }

        average /= students.size();

        System.out.println("\n Course grade average: " + average);
    }

    public void roll()
    {
        for(Student student : students)
        {
            System.out.println("\n" + student.toString());
        }
    }
}
