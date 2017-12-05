package com.finalproj.maven.test;

import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

import com.finalproj.maven.classes.CalculatorBasic;

public class CalculatorBasicTest {
	private static final Logger LOG = Logger.getLogger(CalculatorBasic.class.getName());
	CalculatorBasic cb = new CalculatorBasic();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat();

	@Test
	public void testAdditionPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*10));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*10));
			result = firstNumber+secondNumber;
			
			LOG.info("Testing the method addition with: "+ firstNumber +" and " + secondNumber+" Result: "+result);
			assertEquals(cb.addition(firstNumber, secondNumber), result,0.2);
		}
	}
	
	@Test
	public void testAdditionNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*-10));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*-10));
			result = firstNumber+secondNumber;
			
			LOG.info("Testing the method addition with: "+ firstNumber +" and " + secondNumber+" Result: "+result);
			assertEquals(cb.addition(firstNumber, secondNumber), result,0.2);
		}
	}
	
	@Test
	public void testAdditionZeros() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		result = firstNumber + secondNumber;
			
		LOG.info("Testing the method addition with: "+ firstNumber +" and " + secondNumber);
		assertEquals(Math.round(cb.addition(firstNumber, secondNumber)), Math.round(result),1);
		
		for(int i=0;i<50;i++) {
			firstNumber = 0;
			secondNumber = Double.valueOf(df.format(random.nextDouble()*10));
			result = firstNumber+secondNumber;
			
			LOG.info("Testing the method addition with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(cb.addition(firstNumber, secondNumber)), Math.round(result),1);
			
		}

			
		for(int i=0;i<50;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*10));;
			secondNumber = 0;
			result = firstNumber+secondNumber;
			
			LOG.info("Testing the method addition with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(cb.addition(firstNumber, secondNumber)), Math.round(result),1);	
		}
	}
	
	@Test
	public void testSubtractionPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*10));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*10));
			result = firstNumber-secondNumber;
			
			LOG.info("Testing the method subtraction with: "+ firstNumber +" and " + secondNumber+" Result: "+result);
			assertEquals(cb.subtraction(firstNumber, secondNumber), result,0.2);
		}
	}
	
	@Test
	public void testSubtractionNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*-10));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*-10));
			result = firstNumber-secondNumber;
			
			LOG.info("Testing the method subtraction with: "+ firstNumber +" and " + secondNumber+" Result: "+result);
			assertEquals(cb.subtraction(firstNumber, secondNumber), result,0.2);
		}
	}
	
	@Test
	public void testSubtractionZeros() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		result = firstNumber - secondNumber;
			
		LOG.info("Testing the method subtraction with: "+ firstNumber +" and " + secondNumber+ " Result: "+result);
		assertEquals(cb.subtraction(firstNumber, secondNumber), result,1);
		
		for(int i=0;i<200;i++) {
			firstNumber = 0;
			secondNumber = Double.valueOf(df.format(random.nextDouble()*1000));
			result = firstNumber-secondNumber;
			
			LOG.info("Testing the method subtraction with: "+ firstNumber +" and " + secondNumber+" Result: "+result);
			assertEquals(cb.subtraction(firstNumber, secondNumber), result,1);
			
		}

		
		for(int i=0;i<200;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*1000));;
			secondNumber = 0;
			result = firstNumber-secondNumber;
			
			LOG.info("Testing the method subtraction with: "+ firstNumber +" and " + secondNumber+ " Result: "+result);
			assertEquals(cb.subtraction(firstNumber, secondNumber), result,1);	
		}
	}
	
	@Test
	public void testMultiplicationPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*10));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*10));
			result = firstNumber*secondNumber;
			
			LOG.info("Testing the method multiplication with: "+ firstNumber +" and " + secondNumber+" Result: "+result);
			assertEquals(cb.multiplication(firstNumber, secondNumber), result,0.2);
		}
	}
	
	@Test
	public void testMultiplicationNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*-10));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*-10));
			result = firstNumber*secondNumber;
			
			LOG.info("Testing the method multiplication with: "+ firstNumber +" and " + secondNumber+" Result: "+result);
			assertEquals(cb.multiplication(firstNumber, secondNumber), result,0.2);
		}
	}
	
	@Test
	public void testMultiplicationZeros() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		result = firstNumber * secondNumber;
			
		LOG.info("Testing the method multiplication with: "+ firstNumber +" and " + secondNumber+ " Result: "+result);
		assertEquals(cb.multiplication(firstNumber, secondNumber), result,1);
		
		for(int i=0;i<200;i++) {
			firstNumber = 0;
			secondNumber = Double.valueOf(df.format(random.nextDouble()*1000));
			result = firstNumber*secondNumber;
			
			LOG.info("Testing the method multiplication with: "+ firstNumber +" and " + secondNumber+" Result: "+result);
			assertEquals(cb.multiplication(firstNumber, secondNumber), result,1);
			
		}

		
		for(int i=0;i<200;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*1000));;
			secondNumber = 0;
			result = firstNumber*secondNumber;
			
			LOG.info("Testing the method multiplication with: "+ firstNumber +" and " + secondNumber+ " Result: "+result);
			assertEquals(cb.multiplication(firstNumber, secondNumber), result,1);	
		}
	}
	
	@Test
	public void testDivisionPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*10));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*10));
			result = firstNumber/secondNumber;
			
			LOG.info("Testing the method division with: "+ firstNumber +" and " + secondNumber+" Result: "+result);
			assertEquals(cb.division(firstNumber, secondNumber), result,0.2);
		}
	}
	
	@Test
	public void testDivisionNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0; i < 50; i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*-10));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*-10));
			result = firstNumber/secondNumber;
			
			LOG.info("Testing the method division with: "+ firstNumber +" and " + secondNumber+" Result: "+result);
			assertEquals(cb.division(firstNumber, secondNumber), result,0.2);
		}
	}
	
	@Test
	public void testDivisionZeros() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = -0.123456789;
		
		result = firstNumber / secondNumber;
			
		LOG.info("Testing the method division with: "+ firstNumber +" and " + secondNumber+ " Result: "+result);
		assertEquals(cb.division(firstNumber, secondNumber), result,1);
		
		for(int i=0;i<50;i++) {
			firstNumber = 0;
			secondNumber = Double.valueOf(df.format(random.nextDouble()*10));
			result = -0.123456789;
			
			LOG.info("Testing the method division with: "+ firstNumber +" and " + secondNumber+" Result: "+result);
			assertEquals(cb.division(firstNumber, secondNumber), result,1);
			
		}

		
		for(int i=0;i<50;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*10));;
			secondNumber = 0;
			result = -0.123456789;
			
			
			LOG.info("Testing the method division with: "+ firstNumber +" and " + secondNumber+ " Result: "+result);
			assertEquals(cb.division(firstNumber, secondNumber), result,1);	
		}
	}

}
