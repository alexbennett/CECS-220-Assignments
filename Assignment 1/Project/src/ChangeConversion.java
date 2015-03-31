import java.util.Scanner;

public class ChangeConversion
{
    public static void main(String[] args)
    {
        // Define variables
        int quarters, dimes, nickles, pennies, totalCents;

        // Initiate scanner for accepting values
        Scanner scanner = new Scanner(System.in);

        // Accept the values from the user
        System.out.print("Enter number of quarters (integers only): ");
        quarters = scanner.nextInt();
        System.out.print("Enter number of dimes (integers only): ");
        dimes = scanner.nextInt();
        System.out.print("Enter number of nickles (integers only): ");
        nickles = scanner.nextInt();
        System.out.print("Enter number of pennies (integers only): ");
        pennies = scanner.nextInt();

        // Do the conversion
        totalCents = quarters * 25 + dimes * 10 + nickles * 5 + pennies;

        // Done! Print it all out
        System.out.println("Thanks! You have a total of $" + ((double) totalCents / 100) + "!");
    }
}
