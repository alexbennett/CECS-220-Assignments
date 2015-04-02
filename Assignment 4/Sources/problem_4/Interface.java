package problem_4;

import java.awt.*;

import javax.swing.*;

public class Interface
{
	public static void main(String... args)
	{
		// Create frame and defaults
		JFrame frame = new JFrame("Phone Dialer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Set size
		frame.setPreferredSize(new Dimension(400, 400));

		// Add elements
		frame.getContentPane().add(new Phone());

		// Display
		frame.pack();
		frame.setVisible(true);
	}
}
