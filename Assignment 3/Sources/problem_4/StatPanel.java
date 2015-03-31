package problem_4;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StatPanel extends JPanel
{
    private StatDisplayPanel statDisplayPanel;
    private JButton calculateButton;
    private JTextArea inputTextArea;

    public StatPanel()
    {
        // Create statistic display panel
        statDisplayPanel = new StatDisplayPanel();
        statDisplayPanel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createTitledBorder("Statistics"), new EmptyBorder(10, 10, 10, 10)));
        add(statDisplayPanel);

        // Create components
        calculateButton = new JButton("Calculate");
        inputTextArea = new JTextArea("", 2, 20);

        // Add listeners
        StatListener listener = new StatListener();
        calculateButton.addActionListener(listener);

        // Add to view
        add(inputTextArea);
        add(calculateButton);
    }

    private class StatListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            // Button pressed
            statDisplayPanel.updateString(inputTextArea.getText());
        }
    }
}