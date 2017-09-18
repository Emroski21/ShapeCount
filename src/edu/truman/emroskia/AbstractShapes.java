package edu.truman.emroskia;

import java.awt.Graphics2D;
import java.awt.geom.Point2D;

public abstract class AbstractShapes implements Shape {
	
	private int x;
	private int y;
	private int width;
	
	public AbstractShapes(int x, int y,int width)
	{
		this.x = x;
		this.y = y; 
		this.width = width;
		
	}
	
	public void draw(Graphics2D g2) 
	{
		
	}
	public boolean contains(Point2D aPoint)
	{
		return false;
		
	}
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}

}
