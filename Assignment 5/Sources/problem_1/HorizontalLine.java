package problem_1;

import java.awt.*;

public class HorizontalLine
{
	private Color color;
	private Point location;
	private int length;

	public HorizontalLine(Point location, int length, Color color)
	{
		this.location = location;
		this.length = length;
		this.color = color;
	}

	public void setLength(int length)
	{
		this.length = length;
	}

	public void translateLineX(int amount)
	{
		location.translate(amount, 0);
	}

	public Point getLocation()
	{
		return location;
	}

	public int getLength()
	{
		return length;
	}

	public void drawLine(Graphics graphics)
	{
		Color previousColor = graphics.getColor();

		graphics.setColor(color);
		graphics.drawLine(location.x, location.y, location.x + length, location.y);

		graphics.setColor(previousColor);
	}
}
