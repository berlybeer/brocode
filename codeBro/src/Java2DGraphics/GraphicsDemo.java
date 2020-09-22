package Java2DGraphics;

import java.awt.*;
import javax.swing.*;

public class GraphicsDemo extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		this.setBackground(Color.BLACK);
		
		Graphics2D g2D = (Graphics2D) g;
		GradientPaint paint = new GradientPaint(100, 50, Color.RED, 420, 0, Color.BLUE);	
		
//		int[] xPoints = {50, 100,150,200,250,300,350};
//		int[] yPoints = {350,250,275,200,275,150,100};
//		
//		int nPoints = xPoints.length;
		
		int[] x = {100,200,300,400};
		int[] y = {300,127,300,400};
		
//		
//		g2D.setColor(Color.MAGENTA);
//		g2D.setStroke(new BasicStroke(20));
//		g2D.drawLine(0, 0, 400, 400);
		
//		g2D.setColor(Color.GREEN);
//		g2D.setStroke(new BasicStroke(2));
//		g2D.drawPolyline(xPoints, yPoints, nPoints);
//		
//		g2D.setFont(new Font("Cominc Sans", Font.ITALIC, 25));
//		g2D.setColor(Color.GREEN);
//		g2D.drawString("STONKS", 100,100);
//		
//		g2D.setColor(Color.YELLOW);
//		g2D.drawPolygon(x,y,3);
//		g2D.fillPolygon(x,y,3);
		
//		g2D.setColor(Color.PINK);
//		g2D.drawRect(50,50,300,200);
//		g2D.fillRect(50, 50, 300, 200);
//		
//		g2D.setColor(Color.ORANGE);
//		g2D.drawOval(50,50,200,300);
//		g2D.fillOval(50, 50, 200, 300);
		
		
//		g2D.setPaint(new Color(150,250,150));
//		g2D.drawArc(50,  50,  300,  300, 180, 270);
//		g2D.fillArc(50,  50,  300,  300, 180, 270);
		
		g2D.setPaint(paint);
		g2D.fillArc(50, 50, 300, 300, 180, 270);
		
		

		
		
//		
	}


}
