/*
 * File: PythagoreanTheorem.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is for the PythagoreanTheorem problem.
 * 
 * Author:Chao Liu
 * Contact: liuchao200240@gmail.com
 
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

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
		// Read in the value of a and b.
		println("Enter values to compute Pythagorean theorem.");
		double a = readInt("a:");
		double b = readInt("b:");
		
		// Compute the value of c.
		double c = compute(a,b);
		
		// print result 
		println("c = " + c);	
		
//		printResult(a,b); //compute and print 
		
	}

	//????
	private double compute(double a, double b) {
		double d = a * a + b * b;
		double c = Math.sqrt(d);
		//Print the value of c.
		return c;
	}
}
