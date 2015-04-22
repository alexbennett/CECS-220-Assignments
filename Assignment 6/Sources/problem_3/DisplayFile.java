//********************************************************************
// DisplayFile.java                   Author: Lewis/Loftus
//
// Demonstrates the use of a file chooser and a text area.
//********************************************************************
package problem_3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

import javax.swing.*;

public class DisplayFile
{
    private static JTextArea textArea;
    private static JButton saveButton;
    private static JLabel statusLabel;
    private static File file;
    private static FileWriter fileWriter;

	// -----------------------------------------------------------------
	// Opens a file chooser dialog, reads the selected file and
	// loads it into a text area.
	// -----------------------------------------------------------------
	public static void main(String[] args) throws IOException
	{
		JFrame frame = new JFrame("Display File");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Retrieve file
        JFileChooser chooser = new JFileChooser();
        int status = chooser.showOpenDialog(null);
        textArea = new JTextArea(20, 30);
        textArea.setBorder(BorderFactory.createLineBorder(Color.white, 10));
        if(status != JFileChooser.APPROVE_OPTION)
        {
            textArea.setText("No file chosen.");
        }
        else
        {
            file = chooser.getSelectedFile();
            Scanner scan = new Scanner(file);

            String info = "";
            while(scan.hasNext())
            {
                info += scan.nextLine() + "\n";
            }

            textArea.setText(info);
        }

        // Create file writer
        fileWriter = new FileWriter(file, false);

        // Create editor panel
        FileEditorPanel panel = new FileEditorPanel();

        frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}

    private static class FileEditorPanel extends JPanel
    {
        public FileEditorPanel()
        {
            // Set layout
            setLayout(new BorderLayout());

            // Create components
            saveButton = new JButton("Save");
            saveButton.addActionListener(new ButtonListener());
            statusLabel = new JLabel("File opened.");
            statusLabel.setBorder(BorderFactory.createLineBorder(Color.white, 5));

            // Add to layout
            add(saveButton, BorderLayout.NORTH);
            add(textArea, BorderLayout.CENTER);
            add(statusLabel, BorderLayout.SOUTH);
        }
    }

    private static class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if(event.getActionCommand().toLowerCase().equals("save"))
            {
                  try
                  {
                      // Output file
                      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                      bufferedWriter.write(textArea.getText());
                      bufferedWriter.close();

                      // Disable components and update user
                      statusLabel.setText("File written! Please close the program.");
                      saveButton.setEnabled(false);
                      textArea.setEnabled(false);
                  }
                  catch(IOException exception)
                  {
                      // nothing
                  }
            }
        }
    }
}