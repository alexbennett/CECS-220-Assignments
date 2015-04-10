package problem_1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LinePanel extends JPanel
{
	private final int WIDTH = 300, HEIGHT = 200;
	private final int DELAY = 20;

	// Line properties
	private final int LENGTH = 50;
	private final int X_MOVE_AMOUNT = 3;
	private final int STARTING_POINT_X = 5;
	private final int ENDING_POINT_X = 295;
	private final int POSITION_Y = 100;
	private final Color color1 = Color.white, color2 = Color.red;

	private Timer timer;
	private HorizontalLine line1, line2;

	public LinePanel()
	{
		timer = new Timer(DELAY, new LineListener());

		line1 = new HorizontalLine(new Point(STARTING_POINT_X, POSITION_Y), LENGTH, color1);
		line2 = new HorizontalLine(new Point(WIDTH / 2, POSITION_Y), 0, color2);

		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setBackground(Color.black);
		timer.start();
	}

	public void paintComponent(Graphics graphics)
	{
		super.paintComponent(graphics);

		// Draw vertical line
		graphics.setColor(Color.green);
		graphics.drawLine(WIDTH / 2, 0, WIDTH / 2, HEIGHT);

		// Handle line animation
		if(line1.getLength() > 0) line1.drawLine(graphics);
		if(line2.getLength() > 0) line2.drawLine(graphics);
	}

	private class LineListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if(line2.getLocation().x + line2.getLength() >= ENDING_POINT_X) return;

			if(line2.getLength() >= LENGTH)
			{
				line2.translateLineX(X_MOVE_AMOUNT);
			}

			if(line1.getLocation().x + line1.getLength() >= WIDTH / 2)
			{
				if(line1.getLength() > 0) line1.setLength(line1.getLength() - X_MOVE_AMOUNT);
				if(line2.getLength() < LENGTH) line2.setLength(line2.getLength() + X_MOVE_AMOUNT);
			}

			line1.translateLineX(X_MOVE_AMOUNT);

			repaint();
		}
	}
}
