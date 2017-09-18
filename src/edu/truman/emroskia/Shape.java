package edu.truman.emroskia;

import java.awt.Graphics2D;
import java.awt.geom.Point2D;

public interface Shape {
	
	void draw(Graphics2D g2);
	boolean contains(Point2D aPoint);
	void setWidth(int width);

}
