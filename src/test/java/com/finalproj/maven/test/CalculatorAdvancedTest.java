package com.finalproj.maven.test;

import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

import com.finalproj.maven.classes.CalculatorAdvanced;

public class CalculatorAdvancedTest {
	private static final Logger LOG = Logger.getLogger(CalculatorAdvanced.class.getName());
	CalculatorAdvanced ca = new CalculatorAdvanced();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();

	@Test
	public void testPercentagePositiveNumbers() {
		double numberToCalculate = 0;
		double amountInPercentage = 0;
		double result = 0;
		
		for(int i = 0; i < 50; i++) {
			numberToCalculate = Double.valueOf(df.format(random.nextDouble()*10));
			amountInPercentage = Double.valueOf(df.format(random.nextDouble()*10));
			result = numberToCalculate*amountInPercentage/100;
			
			LOG.info("Testing the method percentage with the number: "+ numberToCalculate +" and percentage: " + amountInPercentage+" Result: "+result+"%");
			assertEquals(ca.percentage(numberToCalculate, amountInPercentage), result,0.2);
		}
	}
	
	@Test
	public void testPercentageNegativeNumbers() {
		double numberToCalculate = 0;
		double amountInPercentage = 0;
		double result = 0;
		
		for(int i = 0; i < 50; i++) {
			numberToCalculate = Double.valueOf(df.format(random.nextDouble()*-10));
			amountInPercentage = Double.valueOf(df.format(random.nextDouble()*-10));
			result = numberToCalculate*amountInPercentage/100;
			
			LOG.info("Testing the method percentage with the number: "+ numberToCalculate +" and percentage: " + amountInPercentage+" Result: "+result+"%");
			assertEquals(ca.percentage(numberToCalculate, amountInPercentage), result,0.2);
		}
	}
	
	@Test
	public void testPercentageZeros() {
		double numberToCalculate = 0;
		double amountInPercentage = 0;
		double result = 0;
		
		result = numberToCalculate*amountInPercentage/100;
			
		LOG.info("Testing the method percentage with: "+ numberToCalculate +" and " + amountInPercentage);
		assertEquals(ca.percentage(numberToCalculate, amountInPercentage), result,1);
		
		for(int i=0;i<50;i++) {
			numberToCalculate = 0;
			amountInPercentage = Double.valueOf(df.format(random.nextDouble()*10));
			result = numberToCalculate*amountInPercentage/100;
			
			LOG.info("Testing the method percentage with: "+ numberToCalculate +" and " + amountInPercentage);
			assertEquals(ca.percentage(numberToCalculate, amountInPercentage), result,1);
			
		}

			
		for(int i=0;i<50;i++) {
			numberToCalculate = Double.valueOf(df.format(random.nextDouble()*10));;
			amountInPercentage = 0;
			result = numberToCalculate*amountInPercentage/100;
			
			LOG.info("Testing the method percentage with: "+ numberToCalculate +" and " + amountInPercentage);
			assertEquals(Math.round(ca.percentage(numberToCalculate, amountInPercentage)), Math.round(result),1);	
		}
	}
	
	@Test
	public void testSquarePositiveNumbers() {
		double numberToCalculate = 0;
		double result = 0;
		
		for(int i = 0; i < 50; i++) {
			numberToCalculate = Double.valueOf(df.format(random.nextDouble()*10));
			result = numberToCalculate*numberToCalculate;
			
			LOG.info("Testing the method square with the number: "+ numberToCalculate+" Result: "+result);
			assertEquals(ca.square(numberToCalculate), result,0.2);
		}
	}
	
	@Test
	public void testSquareNegativeNumbers() {
		double numberToCalculate = 0;
		double result = 0;
		
		for(int i = 0; i < 50; i++) {
			numberToCalculate = Double.valueOf(df.format(random.nextDouble()*-10));
			result = numberToCalculate*numberToCalculate;
			
			LOG.info("Testing the method square with the number: "+ numberToCalculate+" Result: "+result);
			assertEquals(ca.square(numberToCalculate), result,0.2);
		}
	}
	
	@Test
	public void testSquareZeros() {
		double numberToCalculate = 0;
		double result = 0;
		
		result = numberToCalculate*numberToCalculate;
			
		LOG.info("Testing the method square with: "+ numberToCalculate+" Result: "+result);
		assertEquals(ca.square(numberToCalculate), result,1);
		
	}
	
	@Test
	public void testCubePositiveNumbers() {
		double numberToCalculate = 0;
		double result = 0;
		
		for(int i = 0; i < 50; i++) {
			numberToCalculate = Double.valueOf(df.format(random.nextDouble()*10));
			result = numberToCalculate*numberToCalculate*numberToCalculate;
			
			LOG.info("Testing the method cube with the number: "+ numberToCalculate+" Result: "+result);
			assertEquals(ca.cube(numberToCalculate), result,0.2);
		}
	}
	
	@Test
	public void testCubeNegativeNumbers() {
		double numberToCalculate = 0;
		double result = 0;
		
		for(int i = 0; i < 50; i++) {
			numberToCalculate = Double.valueOf(df.format(random.nextDouble()*-10));
			result = numberToCalculate*numberToCalculate*numberToCalculate;
			
			LOG.info("Testing the method cube with the number: "+ numberToCalculate+" Result: "+result);
			assertEquals(ca.cube(numberToCalculate), result,0.2);
		}
	}
	
	@Test
	public void testCubeZeros() {
		double numberToCalculate = 0;
		double result = 0;
		
		result = numberToCalculate*numberToCalculate*numberToCalculate;
			
		LOG.info("Testing the method cube with: "+ numberToCalculate+" Result: "+result);
		assertEquals(ca.cube(numberToCalculate), result,1);
		
	}
	
	@Test
	public void testSquareRtPositiveNumbers() {
		double numberToCalculate = 0;
		double result = 0;
		
		for(int i = 0; i < 50; i++) {
			numberToCalculate = Double.valueOf(df.format(random.nextDouble()*10));
			result = Math.sqrt(numberToCalculate);
			
			LOG.info("Testing the method squareRt with the number: "+ numberToCalculate+" Result: "+result);
			assertEquals(ca.squareRt(numberToCalculate), result,0.2);
		}
	}
	
	@Test
	public void testSquareRtNegativeNumbers() {
		double numberToCalculate = 0;
		double result = 0;
		
		for(int i = 0; i < 50; i++) {
			numberToCalculate = Double.valueOf(df.format(random.nextDouble()*-10));
			result = Math.sqrt(numberToCalculate);
			
			LOG.info("Testing the method squareRt with the number: "+ numberToCalculate+" Result: "+result);
			assertEquals(ca.squareRt(numberToCalculate), result,0.2);
		}
	}
	
	@Test
	public void testSquareRtZeros() {
		double numberToCalculate = 0;
		double result = 0;
		
		result = Math.sqrt(numberToCalculate);
			
		LOG.info("Testing the method squareRt with: "+ numberToCalculate+" Result: "+result);
		assertEquals(ca.cube(numberToCalculate), result,1);
		
	}
	
	@Test
	public void testSinPositiveNumbers() {
		double numberToCalculate = 0;
		double result = 0;
		
		for(int i = 0; i < 50; i++) {
			numberToCalculate = Double.valueOf(df.format(random.nextDouble()*10));
			double radians = Math.toRadians(numberToCalculate);
			result = Math.sin(radians);
			
			LOG.info("Testing the method sin with the number: "+ numberToCalculate+" Result: "+result);
			assertEquals(ca.sin(numberToCalculate), result,0.2);
		}
	}
	
	@Test
	public void testSinNegativeNumbers() {
		double numberToCalculate = 0;
		double result = 0;
		
		for(int i = 0; i < 50; i++) {
			numberToCalculate = Double.valueOf(df.format(random.nextDouble()*-10));
			double radians = Math.toRadians(numberToCalculate);
			result = Math.sin(radians);
			
			LOG.info("Testing the method sin with the number: "+ numberToCalculate+" Result: "+result);
			assertEquals(ca.sin(numberToCalculate), result,0.2);
		}
	}
	
	@Test
	public void testSinZeros() {
		double numberToCalculate = 0;
		double result = 0;
		double radians = Math.sin(numberToCalculate);
		
		result = Math.sin(radians);
			
		LOG.info("Testing the method sin with: "+ numberToCalculate+" Result: "+result);
		assertEquals(ca.sin(numberToCalculate), result,1);
		
	}
	
	@Test
	public void testCosPositiveNumbers() {
		double numberToCalculate = 0;
		double result = 0;
		
		for(int i = 0; i < 50; i++) {
			numberToCalculate = Double.valueOf(df.format(random.nextDouble()*10));
			double radians = Math.toRadians(numberToCalculate);
			result = Math.cos(radians);
			
			LOG.info("Testing the method sin with the number: "+ numberToCalculate+" Result: "+result);
			assertEquals(ca.cos(numberToCalculate), result,0.2);
		}
	}
	
	@Test
	public void testCosNegativeNumbers() {
		double numberToCalculate = 0;
		double result = 0;
		
		for(int i = 0; i < 50; i++) {
			numberToCalculate = Double.valueOf(df.format(random.nextDouble()*-10));
			double radians = Math.toRadians(numberToCalculate);
			result = Math.cos(radians);
			
			LOG.info("Testing the method sin with the number: "+ numberToCalculate+" Result: "+result);
			assertEquals(ca.cos(numberToCalculate), result,0.2);
		}
	}
	
	@Test
	public void testCosZeros() {
		double numberToCalculate = 0;
		double result = 0;
		double radians = Math.toRadians(numberToCalculate);
		
		result = Math.cos(radians);
			
		LOG.info("Testing the method cos with: "+ numberToCalculate+" Result: "+result);
		assertEquals(ca.cos(numberToCalculate), result,1);
		
	}
}
