package com.finalproj.maven.classes;

import com.finalproj.maven.interfaces.CalculatorAdvancedInterface;

public class CalculatorAdvanced implements CalculatorAdvancedInterface {
	public double percentage(double numberToCalculate,double amountInPercentage) {
		return numberToCalculate*amountInPercentage/100;
	}
	
	public double square(double numberToCalculate) {
		return numberToCalculate*numberToCalculate;
	}
	
	public double cube(double numberToCalculate) {
		return numberToCalculate*numberToCalculate*numberToCalculate;
	}
	
	public double squareRt(double numberToCalculate) {
		return Math.sqrt(numberToCalculate);
	}
	
	public double sin(double numberToCalculate) {
		double radians = Math.toRadians(numberToCalculate);
		return Math.sin(radians);
	}
	
	public double cos(double numberToCalculate) {
		double radians = Math.toRadians(numberToCalculate);
		return Math.cos(radians);
	}

}
