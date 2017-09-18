package edu.truman.emroskia;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class Square extends AbstractShapes
{
	
	public Square(int x, int y, int width)
	{
		super(x, y, width);
	}
	
	public void draw(Graphics2D g2)
	{
		Rectangle2D.Double square = new Rectangle2D.Double(getX(), getY(), getWidth(), getWidth());
		g2.setColor(Color.BLACK);
		g2.draw(square);
		g2.fill(square);
	}
}
