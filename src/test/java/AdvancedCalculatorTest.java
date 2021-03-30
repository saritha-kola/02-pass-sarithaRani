import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import com.example.Calculator.classes.AdvancedCalculator;

public class AdvancedCalculatorTest {
	AdvancedCalculator advancedcalc = new AdvancedCalculator();
	Random rm = new Random();
	
	private static final double DELTA = 0;

	@Test
	public void test() {
		
		double tempRandom = 0;
		tempRandom = rm.nextDouble();
		double tempSqrResult = tempRandom * tempRandom;
		assertEquals(advancedcalc.square(tempRandom), tempSqrResult, DELTA);
		double tempcubertResult = Math.cbrt(tempRandom);
		assertEquals(advancedcalc.cubert(tempRandom), tempcubertResult, DELTA);
		double temppowerResult = Math.pow(tempRandom, tempRandom);
		assertEquals(advancedcalc.power(tempRandom,tempRandom), temppowerResult, DELTA);
		double tempabsResult = Math.abs(tempRandom) ;
		assertEquals(advancedcalc.absolute(tempRandom), tempabsResult, DELTA);
		double tempremaindeResult = tempRandom % tempRandom ;
		assertEquals(advancedcalc.remainder(tempRandom,tempRandom), tempremaindeResult, DELTA);
		double tempadditionResult = tempRandom + tempRandom ;
		assertEquals(advancedcalc.addition(tempRandom,tempRandom), tempadditionResult, DELTA);
		double tempaddResult = tempRandom + tempRandom ;
		assertEquals(advancedcalc.addition(tempRandom,tempRandom), tempaddResult, DELTA);
		double tempsubstractionResult = tempRandom - tempRandom ;
		assertEquals(advancedcalc.substraction(tempRandom,tempRandom), tempsubstractionResult, DELTA);
		double tempmulResult = tempRandom * tempRandom ;
		assertEquals(advancedcalc.multiplication(tempRandom,tempRandom), tempmulResult, DELTA);
		double tempdivResult = tempRandom / tempRandom ;
		assertEquals(advancedcalc.division(tempRandom,tempRandom), tempdivResult, DELTA);
		
	  assertEquals(advancedcalc.square(4), 16, DELTA);
	  assertEquals(advancedcalc.cubert(27), 3, DELTA);
	  assertEquals(advancedcalc.remainder(4,2), 0, DELTA);
	  assertEquals(advancedcalc.absolute(-5), 5,DELTA);
	  assertEquals(advancedcalc.power(3, 3), 27,DELTA);
	  assertEquals(advancedcalc.addition(2,2),4, DELTA);
      assertEquals(advancedcalc.substraction(3,2),1, DELTA);		 
      assertEquals(advancedcalc.multiplication(4,2),8,DELTA);
	  assertEquals(advancedcalc.division(8,4),2, DELTA);
	  
	}

}
