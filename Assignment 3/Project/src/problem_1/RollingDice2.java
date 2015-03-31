package problem_1;

public class RollingDice2
{
    public static void main(String[] args)
    {
        PairOfDice pairOfDice = new PairOfDice();

        // Roll
        System.out.println("Rolling dice...");
        pairOfDice.roll();

        // Display values and sum
        System.out.println("Value of die 1: " + pairOfDice.getDieOneValue());
        System.out.println("Value of die 2: " + pairOfDice.getDieTwoValue());
        System.out.println("Sum: " + pairOfDice.sum());

        // Set values manually and sum
        pairOfDice.setDieOneValue(6);
        pairOfDice.setDieTwoValue(6);
        System.out.println("Values of both die set to 6.");
        System.out.println("Sum: " + pairOfDice.sum());

        // All done
        System.out.println("All done!");
    }
}
