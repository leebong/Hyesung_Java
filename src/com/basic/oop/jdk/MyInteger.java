package com.basic.oop.jdk;

public class MyInteger {
	private int data;
	MyInteger(){
		
	}
	MyInteger(int num){
		data = num;
		
	}
	
	private int getData() {
		// TODO Auto-generated method stub
		return this.data;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(this.data);
	}
	
	public static String toBinaryString(int x) {
		return "정수 변수 이진수 변환 ";
	}
	
	public static String toBinaryString(MyInteger x) {
		int temp = x.getData();
		return toBinaryString(temp);
	}
	
	
}
