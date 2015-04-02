package problem_3;

import javax.swing.*;

public class PigLatin
{
    //-----------------------------------------------------------------
    // Reads sentences and translates them into Pig Latin.
    //-----------------------------------------------------------------
    public static void main (String[] args)
    {
        JFrame frame = new JFrame("English to PigLatin");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TranslatorPanel panel = new TranslatorPanel();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}