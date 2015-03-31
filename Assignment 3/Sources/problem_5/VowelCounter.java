package problem_5;

import java.util.Scanner;

public class VowelCounter
{
    public static void main(String[] args)
    {
        // Define variables
        String string;
        int consonantCount = 0, aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0;

        // Initiate scanner for accepting values
        Scanner scanner = new Scanner(System.in);

        // Accept the values from the user
        System.out.print("Enter a string: ");
        string = scanner.nextLine();

        // Get rid of everything except alphabetic characters
        string = string.replaceAll("[^A-Za-z]", "");

        // Calculate
        for(char character : string.toLowerCase().toCharArray())
        {
            switch(character)
            {
                case 'a':
                    aCount++;
                    break;
                case 'e':
                    eCount++;
                    break;
                case 'i':
                    iCount++;
                    break;
                case 'o':
                    oCount++;
                    break;
                case 'u':
                    uCount++;
                    break;
                default:
                    consonantCount++;
                    break;
            }
        }

        // Output counts
        System.out.println("Your string has " + aCount + " A(s), " + eCount + " E(s), " + iCount + " I(s), " + oCount + " O(s), " + uCount + " U(s), and " + consonantCount + " other consonants.");
    }
}
