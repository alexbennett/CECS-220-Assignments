package problem_4;
import javax.swing.*;
import java.awt.*;

public class StatDisplayPanel extends JPanel
{
    private JLabel numWordsLabel, numWords, avgLengthLabel, avgLength;

    public StatDisplayPanel()
    {
        // Set the layout
        setLayout(new GridLayout(3, 2));
        setBackground(Color.LIGHT_GRAY);

        // Create components
        numWordsLabel = new JLabel("Number of words: ");
        numWords = new JLabel("no words entered", SwingConstants.RIGHT);
        avgLengthLabel = new JLabel("Average word length: ");
        avgLength = new JLabel("no words entered", SwingConstants.RIGHT);

        // Add to view
        add(numWordsLabel);
        add(numWords);
        add(avgLengthLabel);
        add(avgLength);
    }

    public void updateString(String string)
    {
        // Split to an array
        String words[] = string.split(" ");

        // Find average word length
        int avgWordLength = 0;
        for(String word : words) avgWordLength += word.length();
        avgWordLength /= words.length;

        // Update labels
        numWords.setText("" + words.length);
        avgLength.setText("" + avgWordLength);

    }
}