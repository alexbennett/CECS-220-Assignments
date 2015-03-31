package problem_4;

import javax.swing.*;
import java.awt.*;

public class TextStats
{
    public static void main(String[] args)
    {
        // Create frame
        JFrame frame = new JFrame("Text Statistics");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panels
        StatPanel statPanel = new StatPanel();

        // Miscellaneous styling
        statPanel.setBackground(Color.LIGHT_GRAY);
        frame.setPreferredSize(new Dimension(370, 165));

        // Display
        frame.getContentPane().add(statPanel);
        frame.pack();
        frame.setVisible(true);
    }
}