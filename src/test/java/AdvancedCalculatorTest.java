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
	public void test() {
		
		 assertEquals(advancedcalc.square(4), 16, DELTA);
		  assertEquals(advancedcalc.cubert(27), 3, DELTA);
		  assertEquals(advancedcalc.remainder(4,2), 0, DELTA);
		  assertEquals(advancedcalc.absolute(-5), 5,DELTA);
		  assertEquals(advancedcalc.power(3, 3), 27,DELTA);
		  assertEquals(advancedcalc.addition(2,2),4, DELTA);
	      assertEquals(advancedcalc.substraction(3,2),1, DELTA);		 
	      assertEquals(advancedcalc.multiplication(4,2),8,DELTA);
		  assertEquals(advancedcalc.division(8,4),2, DELTA);
		
		double tempRandom1 = 0;
		double tempRandom2 = 0;
		tempRandom1 = rm.nextDouble();
		tempRandom2 = rm.nextDouble();
		System.out.println("Test with Positive Values");
		testExecute(tempRandom1,tempRandom2);
		System.out.println("Test with Nagative Values");
		testExecute(-tempRandom1, -tempRandom2);
		System.out.println("Test with 0");
		testExecute(tempRandom1, 0);
		 
	  
	}
	
	public void testExecute(double tempRandom1, double tempRandom2){
		
		double tempSqrResult = tempRandom1 * tempRandom1;
		assertEquals(advancedcalc.square(tempRandom1), tempSqrResult, DELTA);
		
		double tempcubertResult = Math.cbrt(tempRandom1);
		assertEquals(advancedcalc.cubert(tempRandom1), tempcubertResult, DELTA);
		
		double temppowerResult = Math.pow(tempRandom1, tempRandom2);
		assertEquals(advancedcalc.power(tempRandom1,tempRandom2), temppowerResult, DELTA);
		
		double tempabsResult = Math.abs(tempRandom1) ;
		assertEquals(advancedcalc.absolute(tempRandom1), tempabsResult, DELTA);
		
		double tempremaindeResult = tempRandom1 % tempRandom2 ;
		assertEquals(advancedcalc.remainder(tempRandom1,tempRandom2), tempremaindeResult, DELTA);
		
		double tempadditionResult = tempRandom1 + tempRandom2 ;
		assertEquals(advancedcalc.addition(tempRandom1,tempRandom2), tempadditionResult, DELTA);
		assertEquals(basicCalc.addition(tempRandom1,tempRandom2), tempadditionResult, DELTA);
	
		double tempsubstractionResult = tempRandom1 - tempRandom2 ;
		assertEquals(advancedcalc.substraction(tempRandom1,tempRandom2), tempsubstractionResult, DELTA);
		assertEquals(basicCalc.addition(tempRandom1,tempRandom2), tempadditionResult, DELTA);
		
		double tempmulResult = tempRandom1 * tempRandom2 ;
		assertEquals(advancedcalc.multiplication(tempRandom1,tempRandom2), tempmulResult, DELTA);
		assertEquals(basicCalc.addition(tempRandom1,tempRandom2), tempadditionResult, DELTA);
		
		double tempdivResult = 0;
		if (tempRandom2 == 0)
				tempdivResult = 0;
		else 
				 tempdivResult = tempRandom1 / tempRandom2 ;
		assertEquals(advancedcalc.division(tempRandom1,tempRandom2), tempdivResult, DELTA);
		assertEquals(basicCalc.addition(tempRandom1,tempRandom2), tempadditionResult, DELTA);
		
	}
	
	

}
