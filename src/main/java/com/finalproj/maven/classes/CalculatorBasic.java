package com.finalproj.maven.classes;

import com.finalproj.maven.interfaces.CalculatorBasicInterface;

public class CalculatorBasic implements CalculatorBasicInterface{
	public double addition(double firstNumber,double secondNumber) {
		return firstNumber+secondNumber;
	}
	public double subtraction(double firstNumber,double secondNumber) {
		return firstNumber-secondNumber;
	}
	public double multiplication(double firstNumber,double secondNumber) {
		return firstNumber*secondNumber;
	}
	public double division(double firstNumber,double secondNumber) {
		double result = firstNumber/secondNumber;
		if(Double.isInfinite(result)) {
			System.out.println("You can't divide by zero");
			return -0.123456789;
		}
		return result;
	}

}
