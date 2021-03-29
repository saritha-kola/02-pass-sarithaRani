package com.example.Calculator.classes;

import com.example.Calculator.Interfaces.AdvancedOperations;

public class AdvancedCalculator extends BasicCalculator implements AdvancedOperations {

	public double square(double number) {
	  double result = number * number;
		return result;
	}

	public double cube(double x) {
		double result = Math.cbrt(0) ;
		return result;
	}

	public double power(double base, double exponent) {
		double result = Math.pow(base,  exponent);
		return result;
	}

	public double absolute(double x) {
		double result = Math.abs(0);
		return result;
	}

	public double remainder(double dividend, double divisor) {
		double result = dividend % divisor;
		return result;
	}
	

}
