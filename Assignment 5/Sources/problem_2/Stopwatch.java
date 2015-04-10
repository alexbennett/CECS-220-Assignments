package problem_2;

import java.awt.*;

import javax.swing.*;

public class Stopwatch
{
	public static void main(String... args)
	{
		JFrame frame = new JFrame("Stopwatch");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(300, 200));
		frame.getContentPane().add(new StopwatchPanel());
		frame.pack();
		frame.setVisible(true);
	}
}
