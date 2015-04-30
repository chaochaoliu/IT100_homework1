/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 
 * Total grade: 85
 * How to grade:
 * 1. Must run correct (60%): 60
 * 2. Proper Comments: file comment and function comment (10%): 5
 * 3. Follow the style guideline (10%): 10
 * 4. A right "top-down" Decomposition (20%): 10
 * 5. If late one-day, reduce 10%: use 1 grade day 
 * 6. If late more than three days, no grade.  
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	public void run() {
		println("This program finds the largest and smallest numbers.");

		// Read in the first number.
		int largest = 0;
		int smallest = 0;
		int temp; 
		
		temp = readInt("? "); // initialize largest and smallest with the first input
		if(temp == 0) {
			//handler the exception
			//print error msg
			print("No number read in.");
		}
		else {
			largest = temp;
			smallest = temp;
			
			while(true) {
				temp = readInt("? ");
				if (temp == 0) {
					break;
				} else if (temp > largest) {
					largest = temp;
				} else if (temp < smallest) {
					smallest = temp;
				}
			}
			// Print the smallest and largest number.
			println("smallest: " + smallest);
			println("largest: " + largest);
		}

	}
	
}
