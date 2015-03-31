//********************************************************************
// Student.java Author: Lewis/Loftus
//
// Represents a college student.
//********************************************************************
package problem_1;

public class Student
{
	private String firstName, lastName;
	private Address homeAddress, schoolAddress;
	private double testScores[];

	// -----------------------------------------------------------------
	// Constructor: Sets up this student with the specified values.
	// -----------------------------------------------------------------
	public Student(String first, String last, Address home, Address school)
	{
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;

		testScores = new double[]{0, 0, 0};
	}

	public void setTestScore(int testNumber, double testScore)
	{
		if(testNumber != 1 && testNumber != 2 && testNumber != 3) return;
		testScores[testNumber - 1] = testScore;
	}

	public double average()
	{
		double average = 0;
		average += testScores[0] + testScores[1] + testScores[2];
		average /= 3;
		return average;
	}

	// -----------------------------------------------------------------
	// Returns a string description of this Student object.
	// -----------------------------------------------------------------
	public String toString()
	{
		String result;
		result = firstName + " " + lastName + "\n";
		result += "Home Address:\n" + homeAddress + "\n";
		result += "School Address:\n" + schoolAddress + "\n";
		result += "Test Scores: " + testScores[0] + ", " + testScores[1] + ", " + testScores[2] + "\n";
		result += "Test Average: " + average() + "\n";
		return result;
	}
}