import java.util.Random;

public class NumberGenerator
{
    public static void main(String[] args)
    {
        // Create variables
        double number, cos, sin, tan;

        // Generate number
        Random rand = new Random();
        number = rand.nextInt(21) + 20; // range from 20 to 40

        // Trig
        cos = Math.cos(number);
        sin = Math.sin(number);
        tan = Math.tan(number);

        // Output
        System.out.println("Done --------- (assumes radians) ---");
        System.out.println(" number:    " + (int) number); // cast as int to look pretty
        System.out.println(" sin:       " + sin);
        System.out.println(" cos:       " + cos);
        System.out.println(" tan:       " + tan);
        System.out.println("------------------------------------");
    }
}
