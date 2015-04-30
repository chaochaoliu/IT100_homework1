/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 * 
 * Total grade: 95
 * How to grade:
 * 1. Must run correct (60%): 60
 * 2. Proper Comments: file comment and function comment (10%): 5
 * 3. Follow the style guideline (10%): 10
 * 4. A right "top-down" Decomposition (20%): 20
 * 5. If late one-day, reduce 10%: use 1 grade day 
 * 6. If late more than three days, no grade.  
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
	
	//	comment ??? 
	private void drawCircle(int x, int y, double z, Color c) {
		GOval circle = new GOval(x-z, y-z, 2*z, 2*z); 
				circle.setColor(c);
				circle.setFilled(true);
				circle.setFillColor(c);
			      add(circle);
	}
}
