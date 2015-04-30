/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is for the Hailstone problem.
 * Author:Chao Liu
 * Contact: liuchao200240@gmail.com
 * 
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

public class Hailstone extends ConsoleProgram {
	public void run() {
		// Read in the initial number.
		int n = readInt("Enter a number: ");
		// Print the calculate process and result.
		printResult(n);
	}

	private void printResult(int n) {
		// If n equals to 0, then return.
		if (n == 0) {
			return;
		}
		// Define the number of steps
		int i = 0;
		while (n != 1) {
			// If n is odd, n = 3 * n +1.
			if (n % 2 == 1) {
				println(n + " is odd, so I make 3n+1: " + 3 * n + 1);
				n = 3 * n + 1;

				// If n is even, n = n/2.
			} else {
				println(n + " is even, so I take half: " + n / 2);
				n = n / 2;
			}
			i++;
		}
		// Print the result.
		println("The process took " + i + " to reach 1");
	}
}
