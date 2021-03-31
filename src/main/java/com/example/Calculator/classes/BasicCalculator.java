package com.example.Calculator.classes;

import com.example.Calculator.Interfaces.BasicOperations;

public class BasicCalculator implements BasicOperations{
	
	public double addition(double firstNumber, double secondNumber) {
		double result = firstNumber + secondNumber;
		return result;		
	}

	public double substraction(double firstNumber, double secondnumber) {
		double result = firstNumber - secondnumber;
		return result;	
	}

	public double multiplication(double firstNumber, double secondNumber) {
		double result =firstNumber *  secondNumber;
		return result;
	}

	public double division(double firstNumber, double secondNumber) {
		if(secondNumber ==0.0) {
			System.out.println("You cannot divide by Zero");
			return 0;
		}else {
			double result = firstNumber / secondNumber;
		
		return  result;
		}
	}

}
