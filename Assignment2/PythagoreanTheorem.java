/*
 * File: PythagoreanTheorem.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is for the PythagoreanTheorem problem.
 * 
 * Author:Chao Liu
 * Contact: liuchao200240@gmail.com
 */

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
		// Read in the value of a and b.
		println("Enter values to compute Pythagorean theorem.");
		int a = readInt("a:");
		int b = readInt("b:");
		// Compute the value of c.
		int d = a * a + b * b;
		double c = Math.sqrt(d);
		//Print the value of c.
		println("c =" + c);
	}
}
