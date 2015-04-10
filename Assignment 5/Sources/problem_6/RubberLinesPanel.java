//********************************************************************
// RubberLinesPanel.java Author: Lewis/Loftus
//
// Represents the primary drawing panel for the RubberLines program.
//********************************************************************
package problem_6;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.*;

public class RubberLinesPanel extends JPanel
{
	private Point tempPoint1, tempPoint2;
	private Map<Point, Point> points;

	// -----------------------------------------------------------------
	// Constructor: Sets up this panel to listen for mouse events.
	// -----------------------------------------------------------------
	public RubberLinesPanel()
	{
		LineListener listener = new LineListener();
		points = new HashMap<Point, Point>();
		addMouseListener(listener);
		addMouseMotionListener(listener);
		setBackground(Color.black);
		setPreferredSize(new Dimension(400, 200));
	}

	// -----------------------------------------------------------------
	// Draws the current line from the initial mouse-pressed point to
	// the current position of the mouse.
	// -----------------------------------------------------------------
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		page.setColor(Color.yellow);

		for(Map.Entry<Point, Point> clickPoint : points.entrySet())
		{
			page.drawLine(clickPoint.getKey().x, clickPoint.getKey().y, clickPoint.getValue().x, clickPoint.getValue().y);
		}
	}

	// *****************************************************************
	// Represents the listener for all mouse events.
	// *****************************************************************
	private class LineListener implements MouseListener, MouseMotionListener
	{
		// --------------------------------------------------------------
		// Captures the initial position at which the mouse button is
		// pressed.
		// --------------------------------------------------------------
		public void mousePressed(MouseEvent event)
		{
			tempPoint1 = event.getPoint();
		}

		// --------------------------------------------------------------
		// Gets the current position of the mouse as it is dragged and
		// redraws the line to create the rubberband effect.
		// --------------------------------------------------------------
		public void mouseDragged(MouseEvent event)
		{}

		// --------------------------------------------------------------
		// Provide empty definitions for unused event methods.
		// --------------------------------------------------------------
		public void mouseClicked(MouseEvent event)
		{}

		public void mouseReleased(MouseEvent event)
		{
			tempPoint2 = event.getPoint();

			// Store in map
			points.put(tempPoint1, tempPoint2);

			// Clear temporary points
			tempPoint1 = null;
			tempPoint2 = null;

			repaint();
		}

		public void mouseEntered(MouseEvent event)
		{}

		public void mouseExited(MouseEvent event)
		{}

		public void mouseMoved(MouseEvent event)
		{}
	}
}