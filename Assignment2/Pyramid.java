/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file includes definitions of the constants that match the
 * sample run in the assignment, but you can change these values 
 * causes the generated display to change accordingly.
 * 
 * Author:Chao Liu
 * Contact: liuchao200240@gmail.com
 * 
 * Total grade: 85
 * How to grade:
 * 1. Must run correct (60%): 50
 * 2. Proper Comments: file comment and function comment (10%): 10
 * 3. Follow the style guideline (10%): 5
 * 4. A right "top-down" Decomposition (20%): 20
 * 5. If late one-day, reduce 10%: use 1 grade day 
 * 6. If late more than three days, no grade.  
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

	/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30; //ivar 

	/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

	/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	

	
	public void run() {
//		int a = getWidth();
//		println(a);
		drawPyramid(BRICK_WIDTH, BRICK_HEIGHT, BRICKS_IN_BASE);//???????
	}

	// Draw the pyramid
	private void drawPyramid(int brickWidth, int brickHeight, int bricksInBase) {

		for (int bricksNumber = bricksInBase, layer = 1; bricksNumber > 0; bricksNumber--, layer++) {
			drawBrickRow(bricksNumber, layer, brickWidth, brickHeight);
		}
	}

	// Draw each specific row of pyramid.
	private void drawBrickRow(int bricksNumber, int layer, int brickWidth,
			int brickHeight) {
		int w = getWidth();
		int h = getHeight();

		for (int i = 0; i < bricksNumber; i++) {
			GRect rect = new GRect((w - brickWidth * bricksNumber) / 2
					+ brickWidth * i, h - BRICK_HEIGHT * layer, BRICK_WIDTH,
					BRICK_HEIGHT);
			add(rect);
		}

	}
}
