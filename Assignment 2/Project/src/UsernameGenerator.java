import java.util.Random;
import java.util.Scanner;

public class UsernameGenerator
{
    public static void main(String[] args)
    {
        // Define variables
        String fName, lName, username;
        Random rand = new Random();

        // Initiate scanner for accepting values
        Scanner scanner = new Scanner(System.in);

        // Accept the values from the user
        System.out.print("Please enter your first name: ");
        fName = scanner.nextLine();
        System.out.print("Thanks! Please enter you last name: ");
        lName = scanner.nextLine();

        // Set to lowercase
        fName = fName.toLowerCase();
        lName = lName.toLowerCase();

        // Generate random number
        int number = rand.nextInt(90) + 10;

        // Generate username
        username = "" + fName.charAt(0) + lName.charAt(0) + lName.charAt(1) + lName.charAt(2) + lName.charAt(3) + lName.charAt(4) + number;

        // Done! Print it all out
        System.out.println("All done! Your new username is " + username);
    }
}
