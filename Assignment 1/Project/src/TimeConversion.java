import java.util.Scanner;

public class TimeConversion
{
    public static void main(String[] args)
    {
        // Define variables
        int hours, minutes, seconds, totalSeconds;

        // Initiate scanner for accepting values
        Scanner scanner = new Scanner(System.in);

        // Accept the values from the user
        System.out.print("Enter number of hours (integers only): ");
        hours = scanner.nextInt();
        System.out.print("Enter number of minutes (integers only): ");
        minutes = scanner.nextInt();
        System.out.print("Enter number of seconds (integers only): ");
        seconds = scanner.nextInt();

        // Do the conversion
        totalSeconds = (hours * 60 + minutes) * 60 + seconds;

        // Done! Print it all out
        System.out.println("Thanks! " + hours + " hour(s), " + minutes + " minute(s), and " + seconds + " second(s) is a total of " + totalSeconds + " second(s).");
    }
}
