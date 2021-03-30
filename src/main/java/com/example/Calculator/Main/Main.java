package com.example.Calculator.Main;
import com.example.Calculator.classes.BasicCalculator;
import com.example.Calculator.classes.AdvancedCalculator;

public class Main {
	
	public static void main(String[] args) {
		com.example.Calculator.classes.BasicCalculator basiccalc = new BasicCalculator();
		System.out.println(basiccalc.addition(2, 2));
		System.out.println(basiccalc.substraction(3, 2));
		System.out.println(basiccalc.multiplication(3, 2));
		System.out.println(basiccalc.division(4, 2));
		
		AdvancedCalculator advancedcalculator= new AdvancedCalculator();
		System.out.println(advancedcalculator.square(3.0));
		System.out.println(advancedcalculator.cubert(6));
		System.out.println(advancedcalculator.power(3, 2));
		System.out.println(advancedcalculator.absolute(-500));
		System.out.println(advancedcalculator.remainder(7, 2));	
						
	}	

}
