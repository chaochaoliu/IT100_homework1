/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {

	public void run() {
		//Get the width of the window.
		int windowWidth = getWidth();	
		//Get the height of the window.
		int windowHeigth = getHeight();
	
		//Draw the big red circle.
		drawCircle(windowWidth/2, windowHeigth/2, 72, Color.red);
	    //Draw the middle white circle.  
	    drawCircle(windowWidth/2, windowHeigth/2, 46.8, Color.white);
		//Draw the small red circle.
	    drawCircle(windowWidth/2, windowHeigth/2, 21.6, Color.red);
	      
	}

	private void drawCircle(int x, int y, double z, Color c) {
		GOval circle = new GOval(x-z, y-z, 2*z, 2*z); 
				circle.setColor(c);
				circle.setFilled(true);
				circle.setFillColor(c);
			      add(circle);
	}
}
