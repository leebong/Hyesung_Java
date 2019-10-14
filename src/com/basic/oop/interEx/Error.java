package com.basic.oop.interEx;
/*
 * private
 * protected
 * public
 * 
 * static
 * final
 * default
 * 
 * abstract
 * 
 */
public interface Error {
	final static protected int VALUE_ERROR = 0x7FFFFFFF;
	final static protected int DENOMINATOR_IS_ZERO = 0x7FFFFFFF;
	int number = 1000;
	
	//void func();
	default boolean isZero(int num){
		if(num == 0)
			return true;
		else
			return false;
		
	}
	
	default int isZero2(int num, int num2){
		if(num2 == 0)
			return DENOMINATOR_IS_ZERO;
		else
			return num/num2;
		
	}
	
}
