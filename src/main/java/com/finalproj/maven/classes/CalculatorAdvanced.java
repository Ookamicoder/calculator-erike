package com.finalproj.maven.classes;

import com.finalproj.maven.interfaces.CalculatorAdvancedInterface;

/***
 * Final project CalculatorAdvanced
 * 
 * @author erik
 * @version 1.0
 * 
 * This is the class CalculatorAdvanced, it contains the methods for the advanced arithmetic operations.
 *
 */

public class CalculatorAdvanced implements CalculatorAdvancedInterface {
	/**
	 * A method that calculates the percentage of a number.
	 */
	public double percentage(double numberToCalculate,double amountInPercentage) {
		return numberToCalculate*amountInPercentage/100;
	}
	/**
	 * A method that calculates the square of a number.
	 */
	
	public double square(double numberToCalculate) {
		return numberToCalculate*numberToCalculate;
	}
	/**
	 * A method that calculates the cube of a number.
	 */
	
	public double cube(double numberToCalculate) {
		return numberToCalculate*numberToCalculate*numberToCalculate;
	}
	/**
	 * A method that calculates the square root of a number.
	 */
	
	public double squareRt(double numberToCalculate) {
		return Math.sqrt(numberToCalculate);
	}
	/**
	 * A method that calculates a number into radians and returns the trigonometric sine of an angle.
	 */
	
	public double sin(double numberToCalculate) {
		double radians = Math.toRadians(numberToCalculate);
		return Math.sin(radians);
	}
	/**
	 * A method that calculates a number into radians and returns the trigonometric cosinus of an angle.
	 */
	
	public double cos(double numberToCalculate) {
		double radians = Math.toRadians(numberToCalculate);
		return Math.cos(radians);
	}

}
