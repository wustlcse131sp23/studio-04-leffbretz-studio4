package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		
		StdDraw.setPenColor(69,255,236);
		StdDraw.filledRectangle(0.5,0.5,0.4,0.25);
		
		StdDraw.setPenColor(255,156,69);
		StdDraw.filledCircle(0.23,0.625,0.125);
		
		StdDraw.setPenColor(255,246,69);
		StdDraw.filledCircle(0.23,0.625,.12);
		
		StdDraw.setPenColor(143,255,69);
		StdDraw.filledRectangle(0.5, 0.3, 0.4, 0.05);
		
		StdDraw.setPenColor(122,61,34);
		StdDraw.filledRectangle(0.75,0.39,0.03,0.08);
		
		double [] x = {0.66,.84,0.75};
		double [] y = {0.47,0.47,0.7};	
		StdDraw.setPenColor(37,122,34);
		StdDraw.filledPolygon(x, y);

	}
}