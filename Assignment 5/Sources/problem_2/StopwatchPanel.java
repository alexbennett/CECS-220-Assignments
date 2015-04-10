package problem_2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class StopwatchPanel extends JPanel
{
	// Components
	private JLabel display;
	private JButton startButton, stopButton, resetButton;
	private Timer timer;
	private int hours, minutes, seconds;

	public StopwatchPanel()
	{
		// Create components
		display = new JLabel("0:00:00");
		display.setFont(new Font("SansSerif", Font.BOLD, 50));
		display.setHorizontalAlignment(JTextField.CENTER);
		startButton = new JButton("Start");
		stopButton = new JButton("Stop");
		resetButton = new JButton("Reset");

		// Create timer
		timer = new Timer(1000, new TimerListener());
		timer.setInitialDelay(0);

		// Create and attach listener
		ButtonListener listener = new ButtonListener();
		startButton.addActionListener(listener);
		stopButton.addActionListener(listener);
		resetButton.addActionListener(listener);

		// Render graphics
		setLayout(new BorderLayout());
		setBackground(Color.lightGray);

		// Add components
		add(display, BorderLayout.NORTH);
		add(startButton, BorderLayout.WEST);
		add(stopButton, BorderLayout.CENTER);
		add(resetButton, BorderLayout.EAST);
	}

	private void incrementTime()
	{
		seconds++;

		if(seconds == 60)
		{
			minutes++;
			seconds = 0;
		}

		if(minutes == 60)
		{
			hours++;
			minutes = 0;
		}
	}

	private void updateDisplay()
	{
		display.setText(hours + ":" + String.format("%02d", minutes) + ":" + String.format("%02d", seconds));
	}

	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if(event.getActionCommand().toLowerCase().equals("start"))
			{
				// Start timing
				timer.start();
			}
			else if(event.getActionCommand().toLowerCase().equals("stop"))
			{
				// Stop timing
				timer.stop();
			}
			else if(event.getActionCommand().toLowerCase().equals("reset"))
			{
				// Stop timer
				timer.stop();

				// Reset count and display
				hours = 0;
				minutes = 0;
				seconds = 0;
				updateDisplay();
			}
		}
	}

	private class TimerListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			updateDisplay();
			incrementTime();
		}
	}
}
