package problem_4;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Phone extends JPanel
{
    private static JLabel display;
    private JButton clearDisplay;
    private Keypad keypad;

    public Phone()
    {
        // Create elements
        display = new JLabel(" ");
        clearDisplay = new JButton("Clear");
        keypad = new Keypad();

        // Setup layout
        setLayout(new BorderLayout());
        Border border = BorderFactory.createLineBorder(Color.white, 5);
        display.setBorder(border);
        keypad.setBorder(border);

        // Attach listener
        clearDisplay.addActionListener(new ButtonListener());

        // Add elements
        add(display, BorderLayout.NORTH);
        add(keypad, BorderLayout.CENTER);
        add(clearDisplay, BorderLayout.EAST);
    }

    public static class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if(event.getActionCommand().toLowerCase().equals("clear"))
            {
                // Reset display
                display.setText(" ");
            }
            else
            {
                // Add to the dialed string
                String currentlyDialed = display.getText();
                display.setText(currentlyDialed + event.getActionCommand());
            }
        }
    }
}

