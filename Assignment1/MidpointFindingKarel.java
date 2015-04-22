/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * The MidpointFindingKarel class leave a beeper on the corner closest to the 
 * center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  The world may be of any size.
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {

	public void run() {
		
		//fill the 1st street with beepers.
		putBeepers();
		
		//find the middle
		while (beepersPresent()) {
			runToMiddle();
		}
		
		//put a beeper at the middle.
		putBeeperAtMiddle();	
	}

	// This method will fill the 1st street with beepers.
	private void putBeepers() {
		while (frontIsClear()) {
			move();
			putBeeper();
		}
		turnAround();
		pickBeeper();
		move();
	}
	
/* Method:runToMiddle()
 * ------------------------
 * This method enable Carel to find the middle point.
 */
	private void runToMiddle() {

		while (beepersPresent()) {
			move();
		}
		turnAround();
		move();
		pickBeeper();
		move();

	}
	
	//put a beeper at the middle.
	private void putBeeperAtMiddle(){
		turnAround();
		move();
		putBeeper();
	}
}