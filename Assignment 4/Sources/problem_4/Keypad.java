package problem_4;

import javax.swing.*;
import java.awt.*;

public class Keypad extends JPanel
{
    public Keypad()
    {
        setLayout(new GridLayout(4, 3));
        setBackground(Color.darkGray);

        // Create buttons
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b10 = new JButton("*");
        JButton b11 = new JButton("0");
        JButton b12 = new JButton("#");

        // Attach listeners
        b1.addActionListener(new Phone.ButtonListener());
        b2.addActionListener(new Phone.ButtonListener());
        b3.addActionListener(new Phone.ButtonListener());
        b4.addActionListener(new Phone.ButtonListener());
        b5.addActionListener(new Phone.ButtonListener());
        b6.addActionListener(new Phone.ButtonListener());
        b7.addActionListener(new Phone.ButtonListener());
        b8.addActionListener(new Phone.ButtonListener());
        b9.addActionListener(new Phone.ButtonListener());
        b10.addActionListener(new Phone.ButtonListener());
        b11.addActionListener(new Phone.ButtonListener());
        b12.addActionListener(new Phone.ButtonListener());

        // Add to panel
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
        add(b11);
        add(b12);
    }
}
