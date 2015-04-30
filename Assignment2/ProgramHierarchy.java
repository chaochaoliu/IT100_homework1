/*
 * File: ProgramHierarchy.java
 * Name: 
 * Section Leader: 
 * ---------------------------
 * This file is the starter file for the ProgramHierarchy problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {	
	private static final int BOX_WIDTH = 100;
	private static final int BOX_HEIGHT = 50;
	private static final int DISTANCE_FROM_TOP = 50;
	private static final int DISTANCE_BETWEEN_LAYER = 50;
	private static final int DISTANCE_BETWEEN_BOXES = 30;
	
	
	
	public void run() {
	int windowWidth = getWidth();
	System.out.println(windowWidth);
      GRect topBox = new GRect((windowWidth-BOX_WIDTH)/2, DISTANCE_FROM_TOP, BOX_WIDTH, BOX_HEIGHT);
      add(topBox);
      
      
      GLabel topLabel = new GLabel("Program");
      double width = topLabel.getWidth();
//      double height = topLabel.getHeight();
      double ascent = topLabel.getAscent();
      topLabel.setLocation((windowWidth-width)/2, DISTANCE_FROM_TOP+BOX_HEIGHT-(BOX_HEIGHT-ascent)/2);

      GLabel middleLabel = new GLabel("GraphicsProgram", (windowWidth-BOX_WIDTH)/2, DISTANCE_FROM_TOP+100);
      add(topLabel);
      add(middleLabel);
      
   

	double middleWidth = middleLabel.getWidth();

	GLine gline = new GLine(0, 200, 100, 100); 
	add(gline);

	
	}
	
}

