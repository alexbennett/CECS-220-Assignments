package problem_1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class StringVault
{
	private static List<String> stringVault;

	public static void main(String... args) throws StringTooLongException
	{
		// Define variables
		String tempString;

		// Initiate string vault
		stringVault = new ArrayList<String>();

		// Initiate scanner for accepting values
		Scanner scanner = new Scanner(System.in);

		// Welcome message/directions
		System.out.println("This program will allow you to store strings in a \"vault\".\nWhen you're finished adding strings, type \"DONE\" and the program will finish.\n");

		do
		{
			System.out.print("Please enter the string you would like to store: ");
			tempString = scanner.nextLine();

			addString(tempString);
			System.out.println("String stored!\n");
		}
		while(!tempString.equals("DONE"));

		// Done, print the strings
		System.out.println("\nYour strings have been stored and will be printed below:");

		for(String string : stringVault)
		{
			System.out.println(" - " + string);
		}
	}

	private static void addString(String string) throws StringTooLongException
	{
		if(string.length() > 20)
		{
			throw new StringTooLongException("Your string is too long. Please limit it to less than 20 characters.");
		}
		else
		{
			stringVault.add(string);
		}
	}
}
