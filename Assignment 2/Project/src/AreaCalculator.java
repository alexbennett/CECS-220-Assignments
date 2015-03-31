import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaCalculator
{
    public static void main(String[] args)
    {
        // Create variables
        double a, b, c, s, area;

        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // Ask for side lengths
        System.out.print("Please enter the length of side A: ");
        a = scanner.nextInt();
        System.out.print("Please enter the length of side B: ");
        b = scanner.nextInt();
        System.out.print("Please enter the length of side C: ");
        c = scanner.nextInt();

        // Perform calculations
        s = (a + b + c) / 2;
        area = Math.sqrt(s * (s-a) * (s-b) * (s-c));

        // Format
        DecimalFormat format = new DecimalFormat("#.###");

        // Print the area
        System.out.println("The area of the triangle you defined is " + format.format(area) + "!");
    }

}
