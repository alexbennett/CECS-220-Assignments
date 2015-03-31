package problem_1;

public class College
{
    public static void main(String... args)
    {
        // Create the course
        Course course = new Course("CECS 220");

        // Create the students
        Student student1 = new Student
                (
                        "Alex",
                        "Bennett",
                        new Address("123 Circle Drive", "Louisville", "KY", 40208),
                        new Address("123 Circle Drive", "Louisville", "KY", 40208)
                );

        Student student2 = new Student
                (
                        "Sam",
                        "Fox",
                        new Address("123 Circle Drive", "Louisville", "KY", 40208),
                        new Address("123 Circle Drive", "Louisville", "KY", 40208)
                );

        Student student3 = new Student
                (
                        "Cole",
                        "Galloway",
                        new Address("123 Circle Drive", "Louisville", "KY", 40208),
                        new Address("123 Circle Drive", "Louisville", "KY", 40208)
                );

        Student student4 = new Student
                (
                        "Quenton",
                        "Woolfolk",
                        new Address("123 Circle Drive", "Louisville", "KY", 40208),
                        new Address("123 Circle Drive", "Louisville", "KY", 40208)
                );

        Student student5 = new Student
                (
                        "Stella",
                        "Nova",
                        new Address("123 Circle Drive", "Louisville", "KY", 40208),
                        new Address("123 Circle Drive", "Louisville", "KY", 40208)
                );

        // Add grades
        student1.setTestScore(1, 100);
        student1.setTestScore(2, 100);
        student1.setTestScore(3, 100);

        student2.setTestScore(1, 100);
        student2.setTestScore(2, 100);
        student2.setTestScore(3, 100);

        student3.setTestScore(1, 65);
        student3.setTestScore(2, 74);
        student3.setTestScore(3, 54);

        student4.setTestScore(1, 87);
        student4.setTestScore(2, 78);
        student4.setTestScore(3, 44);

        student5.setTestScore(1, 97);
        student5.setTestScore(2, 85);
        student5.setTestScore(3, 100);

        // Add students to course
        course.addStudent(student1);
        course.addStudent(student2);
        course.addStudent(student3);
        course.addStudent(student4);
        course.addStudent(student5);

        // Print information
        course.average();
        course.roll();
    }
}
