/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * The code is to instruct Karel to walk to the door of its house, 
 * pick up the newspaper (represented by a beeper, of course), 
 * and then return  to its initial position in the upper left corner
 *  of the house.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {

	public void run() {

		goToDestination();

		goBackToOriginal();
	}

	// Pick up the beeper;
	private void goToDestination() {
		turnRight();
		move();
		turnLeft();
		moveThreeSteps();
		pickBeeper();
	}

	// Go back to the original place;
	private void goBackToOriginal() {
		turnLeft();
		turnLeft();
		moveThreeSteps();
		turnRight();
		move();
		turnRight();
		putBeeper();
	}

	// Move three steps.
	private void moveThreeSteps() {
		for (int i = 0; i < 3; i++)
			move();
	}
}
