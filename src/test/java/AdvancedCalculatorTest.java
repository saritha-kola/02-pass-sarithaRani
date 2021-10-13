import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import com.example.Calculator.classes.AdvancedCalculator;
import com.example.Calculator.classes.BasicCalculator;

public class AdvancedCalculatorTest {
	AdvancedCalculator advancedcalc = new AdvancedCalculator();
	BasicCalculator basicCalc = new BasicCalculator();
	Random rm = new Random();
	
	private static final double DELTA = 0;

	@Test
	public void testSquare()
	{
		AdvancedCalculator advancedcalc = new AdvancedCalculator();
		assertEquals(advancedcalc.square(4), 16, DELTA);
		
	}
	
	@Test
	public void testCubert()
	{
		AdvancedCalculator advancedcalc = new AdvancedCalculator();
		  assertEquals(advancedcalc.cubert(27), 3, DELTA);
		
	}
	@Test
	public void testRemainder()
	{
		AdvancedCalculator advancedcalc = new AdvancedCalculator();
		  assertEquals(advancedcalc.remainder(4,2), 0, DELTA);
		
	}
	@Test
	public void testAbsolute()
	{
		AdvancedCalculator advancedcalc = new AdvancedCalculator();
		  assertEquals(advancedcalc.absolute(-5), 5,DELTA);
		
	}
	
	@Test
	public void testSubstraction()
	{
		AdvancedCalculator advancedcalc = new AdvancedCalculator();
		   assertEquals(advancedcalc.substraction(3,2),1, DELTA);
		
	}
	
	@Test
	public void testAddition()
	{
		AdvancedCalculator advancedcalc = new AdvancedCalculator();
		  assertEquals(advancedcalc.addition(2,2),4, DELTA);
		
	}
	
	@Test
	public void testMultiplication()
	{
		AdvancedCalculator advancedcalc = new AdvancedCalculator();
	    assertEquals(advancedcalc.multiplication(4,2),8,DELTA);
		
	}
	
	@Test
	public void testPower()
	{
		AdvancedCalculator advancedcalc = new AdvancedCalculator();
		 assertEquals(advancedcalc.power(3, 3), 27,DELTA);
		
	}
	
	@Test
	public void testDivision()
	{
		AdvancedCalculator advancedcalc = new AdvancedCalculator();
		  assertEquals(advancedcalc.division(8,4),2, DELTA);
		
	}

	@Test
	public void testSquareWithRandomValues()
	{
		double tempRandom1 = 0;
		tempRandom1 = rm.nextDouble();
		System.out.println("Test Square with Positive Values");
		double tempSqrResult = tempRandom1 * tempRandom1;
		assertEquals(advancedcalc.square(tempRandom1), tempSqrResult, DELTA);
		System.out.println("Test Square with Nagative Values");
		assertEquals(advancedcalc.square(-tempRandom1), tempSqrResult, DELTA);
		System.out.println("Test Square with 0");
		assertEquals(advancedcalc.square(0), 0, DELTA);
		
	}
	
	@Test
	public void testCubertWithRandomValues()
	{
		double tempRandom1 = 0;
		tempRandom1 = rm.nextDouble();
		System.out.println("Test CubeRT with Positive Values");
		double tempcubertResult = Math.cbrt(tempRandom1);
		assertEquals(advancedcalc.cubert(tempRandom1), tempcubertResult, DELTA);
		System.out.println("Test CubeRT with Nagative Values");
		assertEquals(advancedcalc.cubert(-tempRandom1), -tempcubertResult, DELTA);
		System.out.println("Test CubeRT with 0");
		assertEquals(advancedcalc.cubert(0), 0, DELTA);
		
	}
	@Test
	public void testRemainderWithRandomValues()
	{
		double tempRandom1 = 0;
		double tempRandom2 = 0;
		tempRandom1 = rm.nextDouble();
		tempRandom2 = rm.nextDouble();
		System.out.println("Test Remainder with Positive Values");
		double tempremaindeResult = tempRandom1 % tempRandom2 ;
		assertEquals(advancedcalc.remainder(tempRandom1,tempRandom2), tempremaindeResult, DELTA);
		System.out.println("Test Remainder with Nagative Values");
		tempremaindeResult = -tempRandom1 % -tempRandom2 ;
		assertEquals(advancedcalc.remainder(-tempRandom1,-tempRandom2), tempremaindeResult, DELTA);
				
	}
	@Test
	public void testAbsoluteWithRandomValues()
	{
		double tempRandom1 = 0;
		tempRandom1 = rm.nextDouble();
		System.out.println("Test Absolute with Positive Values");
		double tempabsResult = Math.abs(tempRandom1) ;
		assertEquals(advancedcalc.absolute(tempRandom1), tempabsResult, DELTA);
		System.out.println("Test Absolute with Nagative Values");
		assertEquals(advancedcalc.absolute(-tempRandom1), tempabsResult, DELTA);
		System.out.println("Test Absolute with 0");
		assertEquals(advancedcalc.absolute(0), 0, DELTA);
		
	}
	
	@Test
	public void testSubstractionWithRandomValues()
	{
		double tempRandom1 = 0;
		double tempRandom2 = 0;
		tempRandom1 = rm.nextDouble();
		tempRandom2 = rm.nextDouble();
		System.out.println("Test substraction with Positive Values");
		double tempsubstractionResult = tempRandom1 - tempRandom2;
		assertEquals(advancedcalc.substraction(tempRandom1,tempRandom2), tempsubstractionResult, DELTA);
		assertEquals(basicCalc.substraction(tempRandom1,tempRandom2), tempsubstractionResult, DELTA);
		System.out.println("Test substraction with Nagative Values");
		tempsubstractionResult = (-tempRandom1) - (-tempRandom2);
		assertEquals(advancedcalc.substraction(-tempRandom1,-tempRandom2), tempsubstractionResult, DELTA);
		assertEquals(basicCalc.substraction(-tempRandom1,-tempRandom2), tempsubstractionResult, DELTA);
		System.out.println("Test substraction with 0");
		assertEquals(advancedcalc.substraction(0,0), 0, DELTA);
		assertEquals(basicCalc.substraction(0,0), 0, DELTA);
		
	}
	
	@Test
	public void testAdditionWithRandomValues()
	{
		double tempRandom1 = 0;
		double tempRandom2 = 0;
		tempRandom1 = rm.nextDouble();
		tempRandom2 = rm.nextDouble();
		System.out.println("Test Addition with Positive Values");
		double tempadditionResult = tempRandom1 + tempRandom2 ;
		assertEquals(advancedcalc.addition(tempRandom1,tempRandom2), tempadditionResult, DELTA);
		assertEquals(basicCalc.addition(tempRandom1,tempRandom2), tempadditionResult, DELTA);
		System.out.println("Test Addition with Nagative Values");
		tempadditionResult = (-tempRandom1) + (-tempRandom2);
		assertEquals(advancedcalc.addition(-tempRandom1,-tempRandom2), tempadditionResult, DELTA);
		assertEquals(basicCalc.addition(-tempRandom1,-tempRandom2), tempadditionResult, DELTA);
		System.out.println("Test Addition with 0");
		assertEquals(advancedcalc.addition(0,0), 0, DELTA);
		assertEquals(basicCalc.addition(0,0), 0, DELTA);	
	}
	
	@Test
	public void testMultiplicationWithRandomValues()
	{
		double tempRandom1 = 0;
		double tempRandom2 = 0;
		tempRandom1 = rm.nextDouble();
		tempRandom2 = rm.nextDouble();
		System.out.println("Test Multiplication with Positive Values");
		double tempmulResult = tempRandom1 * tempRandom2 ;
		assertEquals(advancedcalc.multiplication(tempRandom1,tempRandom2), tempmulResult, DELTA);
		assertEquals(basicCalc.multiplication(tempRandom1,tempRandom2), tempmulResult, DELTA);
		System.out.println("Test Multiplication with Nagative Values");
		tempmulResult = -tempRandom1 * -tempRandom2 ;
		assertEquals(advancedcalc.multiplication(-tempRandom1,-tempRandom2), tempmulResult, DELTA);
		assertEquals(basicCalc.multiplication(-tempRandom1,-tempRandom2), tempmulResult, DELTA);
		System.out.println("Test Multiplication with 0");
		assertEquals(advancedcalc.multiplication(0,0), 0, DELTA);
		assertEquals(basicCalc.multiplication(0,0), 0, DELTA);	
	}
	
	@Test
	public void testPowerWithRandomValues()
	{
		double tempRandom1 = 0;
		double tempRandom2 = 0;
		tempRandom1 = rm.nextDouble();
		tempRandom2 = rm.nextDouble();
		System.out.println("Test Power with Positive Values");
		double temppowerResult = Math.pow(tempRandom1, tempRandom2);
		assertEquals(advancedcalc.power(tempRandom1,tempRandom2), temppowerResult, DELTA);
		System.out.println("Test Power with Nagative Values");
		temppowerResult = Math.pow(-tempRandom1, -tempRandom2);
		assertEquals(advancedcalc.power(-tempRandom1,-tempRandom2), temppowerResult, DELTA);
		System.out.println("Test Power with 0");
		assertEquals(advancedcalc.power(0,0), 1, DELTA);		
	}
	
	@Test
	public void testDivisionWithRandomValues()
	{
		double tempRandom1 = 0;
		double tempRandom2 = 0;
		tempRandom1 = rm.nextDouble();
		tempRandom2 = rm.nextDouble();
		System.out.println("Test Division with Positive Values");
		double tempdivResult = 0;
		if (tempRandom2 == 0)
				tempdivResult = 0;
		else 
				 tempdivResult = tempRandom1 / tempRandom2 ;
		assertEquals(advancedcalc.division(tempRandom1,tempRandom2), tempdivResult, DELTA);
		assertEquals(basicCalc.division(tempRandom1,tempRandom2), tempdivResult, DELTA);
		System.out.println("Test Division with Nagative Values");
		assertEquals(advancedcalc.division(-tempRandom1,-tempRandom2), tempdivResult, DELTA);
		assertEquals(basicCalc.division(-tempRandom1,-tempRandom2), tempdivResult, DELTA);
		System.out.println("Test Division with 0");
		assertEquals(advancedcalc.division(0,0), 0, DELTA);
		
	}
	

}
