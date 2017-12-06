package com.finalproj.maven.classes;

import com.finalproj.maven.interfaces.CalculatorBasicInterface;

/***
 * Final project CalculatorBasic
 * 
 * @author erik
 * @version 1.0
 * 
 * This is the CalculatorBasic class, it contains the methods for basic arithmetic operations.
 *
 */

public class CalculatorBasic implements CalculatorBasicInterface{
	/**
	 * A method that adds two numbers.
	 */
	public double addition(double firstNumber,double secondNumber) {
		return firstNumber+secondNumber;
	}
	/**
	 * A method that subtracts a number.
	 */
	public double subtraction(double firstNumber,double secondNumber) {
		return firstNumber-secondNumber;
	}
	/**
	 * A method that multiplies two numbers.
	 */
	public double multiplication(double firstNumber,double secondNumber) {
		return firstNumber*secondNumber;
	}
	/**
	 * A method that divides the first number with the second number.
	 */
	public double division(double firstNumber,double secondNumber) {
		double result = firstNumber/secondNumber;
		if(Double.isInfinite(result)) {
			System.out.println("You can't divide by zero");
			return -0.123456789;
		}
		return result;
	}

}
