package problem_2;
import javax.swing.JFrame;

public class Fahrenheit
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Fahrenheit to Celcius");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FahrenheitPanel panel = new FahrenheitPanel();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}