//********************************************************************
// RubberLines.java Author: Lewis/Loftus
//
// Demonstrates mouse events and rubberbanding.
//********************************************************************
package problem_6;

import javax.swing.*;

public class RubberLines
{
	// -----------------------------------------------------------------
	// Creates and displays the application frame.
	// -----------------------------------------------------------------
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Rubber Lines");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new RubberLinesPanel());
		frame.pack();
		frame.setVisible(true);
	}
}