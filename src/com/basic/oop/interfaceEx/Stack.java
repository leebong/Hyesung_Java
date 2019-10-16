package com.basic.oop.interfaceEx;

public interface Stack {
	final static int Overflow = 4996;
	final static int Underflow = 5996;
	final static int Non_error = -1;
	void push(int data);
	int pop();
	
	default int isOverflow(int Index, int Size) {
		if(Size == Index) {		
			System.out.println("myjava." + Overflow + " : stack overflow Error");
			return Overflow;
		}	
		else
			return Non_error; //의미없은 값을 리턴
	}
	
	//실습
	default int isUnderflow(int Index) {
		// 매개변수로 가져온 인덱스 번호가 0이면
		if(Index == 0) {		
			System.out.println("myjava." + Underflow + " : stack underflow Error");
			return Underflow;
		}	
		else
			return Non_error; //의미없은 값을 리턴
	}

}
