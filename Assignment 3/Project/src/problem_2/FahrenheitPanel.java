package problem_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FahrenheitPanel extends JPanel
{
    private JButton calculateButton;
    private JLabel inputLabel, outputLabel, resultLabel;
    private JTextField fahrenheit;

    public FahrenheitPanel()
    {
        // Create components
        calculateButton = new JButton("Calculate");
        inputLabel = new JLabel("Enter temperature in Fahrenheit:");
        outputLabel = new JLabel("Temperature in Celsius: ");
        resultLabel = new JLabel("---");
        fahrenheit = new JTextField(5);

        // Add listeners
        TempListener listener = new TempListener();
        calculateButton.addActionListener(listener);
        fahrenheit.addActionListener(listener);

        // Add to view
        add(inputLabel);
        add(fahrenheit);
        add(calculateButton);
        add(outputLabel);
        add(resultLabel);

        // Finish render
        setPreferredSize(new Dimension(425, 75));
        setBackground(Color.yellow);
    }

    private class TempListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            int fahrenheitTemp, celsiusTemp;
            String text = fahrenheit.getText();
            fahrenheitTemp = Integer.parseInt(text);
            celsiusTemp = (fahrenheitTemp - 32) * 5 / 9;
            resultLabel.setText(Integer.toString(celsiusTemp));
        }
    }
}