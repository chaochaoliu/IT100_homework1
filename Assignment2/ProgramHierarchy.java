/*
 * File: ProgramHierarchy.java
 * Name: 
 * Section Leader: 
 * ---------------------------
 * This file is the starter file for the ProgramHierarchy problem.
 
 * Total grade: 90
 * How to grade:
 * 1. Must run correct (60%): 60
 * 2. Proper Comments: file comment and function comment (10%): 0
 * 3. Follow the style guideline (10%): 10
 * 4. A right "top-down" Decomposition (20%): 20
 * 5. If late one-day, reduce 10%: use 1 grade day 
 * 6. If late more than three days, no grade.  
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {	
	private static final int BOX_WIDTH = 150;
	private static final int BOX_HEIGHT = 50;
	private static final int DISTANCE_FROM_TOP = 110;
	private static final int DISTANCE_BETWEEN_LAYER = 100;
	private static final int DISTANCE_BETWEEN_BOXES = 50;

	public void run() {
		
	//Draw all the boxes.
		int windowWidth = getWidth();
		GRect topBox = new GRect((windowWidth-BOX_WIDTH)/2, DISTANCE_FROM_TOP, BOX_WIDTH, BOX_HEIGHT);
        add(topBox);
		GRect middleBox = new GRect(topBox.getX(), topBox.getY() + BOX_HEIGHT
				+ DISTANCE_BETWEEN_LAYER, BOX_WIDTH, BOX_HEIGHT);
		add(middleBox);
		GRect leftBox = new GRect(middleBox.getX() - DISTANCE_BETWEEN_BOXES
				- BOX_WIDTH, middleBox.getY(), BOX_WIDTH, BOX_HEIGHT);
		add(leftBox);

		GRect rightBox = new GRect(middleBox.getX() + DISTANCE_BETWEEN_BOXES
				+ BOX_WIDTH, middleBox.getY(), BOX_WIDTH, BOX_HEIGHT);
		add(rightBox);
      
      //Draw all the labels.
      drawLabel(topBox,"Program");
      drawLabel(middleBox,"ConsoleProgram");
      drawLabel(leftBox,"GraphicsProgram");
      drawLabel(rightBox,"DialogProgram");      

      //Draw all the lines.
      drawLine(topBox,leftBox);
      drawLine(topBox,middleBox);
      drawLine(topBox,rightBox);
      
	}
	
	// ???? 
	private void drawLabel(GRect box, String content) {
		GLabel label = new GLabel(content);
		label.setLocation(box.getX()+(BOX_WIDTH-label.getWidth())/2, box.getY()+(BOX_HEIGHT+label.getAscent())/2);
		add(label);
	}
	
	// ???? 
	private void drawLine(GRect higherBox, GRect lowerBox) {
		GLine line = new GLine(higherBox.getX()+BOX_WIDTH/2, higherBox.getY()+BOX_HEIGHT, lowerBox.getX()+BOX_WIDTH/2, lowerBox.getY()); 
		add(line);
	}
	
}

