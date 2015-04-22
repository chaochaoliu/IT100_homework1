/*
 * File: StoneMasonKarel.java
 * --------------------------
 *When Karel is done, the missing stones in the columns should be replaced by beepers.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		// fix the first stone
		fixOneStone();
		// fix the rest stone
		fixTheRestStone();
	}

	/*
	 * Method:fixOneStone(); 
	 * --------------------------------- 
	 * This method will enable Carel to fix the stone.
	 * 
	 * Pre-condition:Carel is at the bottom of a unfixed stone, facing east.
	 * 
	 * After-condition:Carel is at the bottom of the stone ,facing east,with the
	 * stone fixed.
	 */
	private void fixOneStone() {
		
		turnLeft();
		
		// check and put beeper from the bottom
		while (frontIsClear()) {
			if (noBeepersPresent()) {
				putBeeper();
			}
			move();
		}
		
		// put a beeper at the top, if there is no beeper.
		if (noBeepersPresent()) {
			putBeeper();
		}
		
		// go back to the bottom.
		turnAround();
		while (frontIsClear()) {
			move();
		}
		turnLeft();

	}

	/*
	 * Method:fixTheRestStone(); --------------------------- This method will
	 * fix the rest stones.
	 * 
	 * Pre-condition:Carel has finished fixing the firs stone.
	 * 
	 * After-condition:Carel finishes all the stone, standing at the
	 * bottom,facing east.
	 */
	private void fixTheRestStone() {
		while (frontIsClear()) {
			moveToNextStone();
			fixOneStone();
		}
	}

	/*
	 * Method:moveToNextStone() --------------------- This method enanble Carel
	 * move forward to the next stone.
	 */
	private void moveToNextStone() {
		// move four steps.
		for (int i = 0; i < 4; i++) {
			move();
		}

	}

}
