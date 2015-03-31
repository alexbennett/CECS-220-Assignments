import java.util.Scanner;

public class SquareCalculator
{
    public static void main(String[] args)
    {
        // Define variables
        int length, perimeter, area;

        // Initiate scanner for accepting values
        Scanner scanner = new Scanner(System.in);

        // Accept the values from the user
        System.out.print("Please enter the length of your squares side (integers only): ");
        length = scanner.nextInt();

        // Calculate
        perimeter = length * 4;
        area = length * length;

        // Done! Print it all out
        System.out.println("Thanks! Your square has a perimeter of " + perimeter + " and an area of " + area + "!");
    }
}
