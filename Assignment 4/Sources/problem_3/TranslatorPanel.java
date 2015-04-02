package problem_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TranslatorPanel extends JPanel
{
    private JButton translateButton;
    private JLabel inputLabel, outputLabel, resultLabel;
    private JTextField toTranslate;

    public TranslatorPanel()
    {
        // Create components
        translateButton = new JButton("Translate");
        inputLabel = new JLabel("Enter sentence in English (no puncuation):");
        outputLabel = new JLabel("Sentence translated to PigLatin: ");
        resultLabel = new JLabel("---");
        toTranslate = new JTextField(10);

        // Add listeners
        TranslationListener listener = new TranslationListener();
        translateButton.addActionListener(listener);
        toTranslate.addActionListener(listener);

        // Add to view
        add(inputLabel);
        add(toTranslate);
        add(translateButton);
        add(outputLabel);
        add(resultLabel);

        // Finish render
        setPreferredSize(new Dimension(475, 75));
        setBackground(Color.white);
    }

    private class TranslationListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            resultLabel.setText(PigLatinTranslator.translate(toTranslate.getText()));
        }
    }
}