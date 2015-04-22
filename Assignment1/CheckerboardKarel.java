/*
 * File: CheckerboardKarel.java
 * ----------------------------
 *  The CheckerboardKarel class will draw a checkerboard using beepers, 
 *  as described in Assignment 1.  The program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	public void run() {
		while (frontIsClear()) {
			
           //draw one row of checkerboard with beepers.
			checkOneRow();
			
			//move to the next row
			turnToNextRow();
		}
	}

	/*
	 * Method:checkOneRow(); 
	 * ----------------------------- 
	 * This method will draw one row of checkerboard with beepers.
	 */

	private void checkOneRow() {
		while (frontIsClear()) {
			putBeeper();
			move();
			if (frontIsClear()) {
				move();
			}
		}

	}

	/*
	 * Method:turnToNextRow();
	 *  -------------------------- 
	 * This method will enable Carel move to the next row.
	 * 
	 * Precondition:Carel is at the end of a row. After-condition:Carel is in
	 * the next row.
	 */
	private void turnToNextRow() {
		if (facingEast()) {
			turnLeft();
			if (frontIsClear()) {
				move();
				turnLeft();
			}
		} else {
			turnRight();
			if (frontIsClear()) {
				move();
				turnRight();
			}
		}

	}
}
