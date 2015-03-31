package problem_6;

import javax.swing.*;
import java.awt.*;

public class Farm
{
    public static void main(String[] args)
    {
        // Create the window
        JFrame frame = new JFrame("Farm");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the scene
        Scene scene = new Scene();
        scene.setVisible(true);

        // Add scene to the frame
        frame.add(scene);

        // Set size
        frame.setPreferredSize(new Dimension(500, 350));

        // Done
        frame.pack();
        frame.setVisible(true);
    }

    static class Scene extends JPanel
    {
        @Override
        public void paintComponent(Graphics graphics)
        {
            super.paintComponent(graphics);
            doDrawing(graphics);
        }

        private void doDrawing(Graphics graphics)
        {
            // Define 2D graphics
            Graphics2D graphics2D = (Graphics2D) graphics;

            // Set sky color
            setBackground(Color.cyan);

            // Draw sun
            graphics2D.setColor(Color.yellow);
            graphics2D.fillOval(-75, -75, 150, 150);

            // Now draw the house
            graphics2D.setColor(Color.white);
            graphics2D.fillRect(125, 125, 212, 300);
            graphics.setColor(Color.darkGray);
            int[] xPoints = {115, 230, 345};
            int[] yPoints = {125, 50, 125};
            graphics2D.fillPolygon(xPoints, yPoints, 3);

            // Draw grass
            graphics2D.setColor(Color.green);
            graphics2D.fillRect(0, 150, 500, 200);

            // Draw fence last
            graphics2D.setColor(new Color(160, 130, 75));
            graphics2D.fillRect(0, 80, 500, 40);
            graphics2D.fillRect(0, 140, 500, 40);
            graphics2D.fillRect(0, 200, 500, 40);
            graphics2D.fillRect(0, 260, 500, 40);
            graphics2D.fillRect(50, 60, 50, 290);
            graphics2D.fillRect(360, 60, 50, 290);
        }
    }
}