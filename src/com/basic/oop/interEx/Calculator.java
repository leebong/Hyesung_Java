package com.basic.oop.interEx;

public class Calculator implements Error, Circle_Calc{
	
	
	public double Circle_Area(int Rad ) {		
		return Rad*Rad*PI;
		
	}
	
	public double Circle_Area(double Rad ) {		
		return Rad*Rad*PI;
		
	}
	
	public int add(int num, int num2) {
		return num+num2;
	}
	public int min(int num, int num2) {
		return num-num2;
	}
	public int nul(int num, int num2) {
		return num*num2;
	}
	public double div(int num, int num2) {
		//if(denominatior(num2)
		//calculator
		
		if(num2 == 0)
			return DENOMINATOR_IS_ZERO;
		else
			return (double)num/num2;
	}
	


}
