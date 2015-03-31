package problem_3;

public class DieTest
{
    public static void main(String[] args)
    {
        // Create new die
        Die die = new Die();

        // Roll and display the number
        die.roll();
        System.out.println("The die landed on " + die.getFaceValue() + "");

        // Attempt to set value larger than 6 and display it
        die.setFaceValue(999);
        System.out.println("Attempted to set the die value to 999... the value is still " + die.getFaceValue() + "");

        // Attempt to set value less than 0 and display it
        die.setFaceValue(-999);
        System.out.println("Attempted to set the die value to -999... the value is still " + die.getFaceValue() + "");
    }
}
