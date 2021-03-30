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
		double tempresult;
		//System.out.println("Test");
		assertEquals(advancedcalc.cubert(27), 3, DELTA);
		//assertEquals("X","X");
		
	  System.out.println("Test");
		
	  assertEquals(advancedcalc.square(4), 16, DELTA);
	  assertEquals(advancedcalc.remainder(4,2), 0, DELTA);
	  assertEquals(advancedcalc.absolute(-5), 5,DELTA);
	  assertEquals(advancedcalc.power(3, 3), 27,DELTA);
	  assertEquals(advancedcalc.addition(2,2),4, DELTA);
      assertEquals(advancedcalc.substraction(3,2),1, DELTA);		 
      assertEquals(advancedcalc.multiplication(4,2),8,DELTA);
	  assertEquals(advancedcalc.division(8,4),2, DELTA);
	  
	}

}
