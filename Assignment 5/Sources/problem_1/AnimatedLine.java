package problem_1;

import javax.swing.*;

public class AnimatedLine
{
	public static void main(String... args)
	{
		JFrame frame = new JFrame("Animated Line");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new LinePanel());
		frame.pack();
		frame.setVisible(true);
	}
}
