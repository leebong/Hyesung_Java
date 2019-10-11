package com.basic.oop.abstractclass;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 OverRideChild = new Child2();
		Child1 AbstractChild = new Child1();
		
		//Parent Computer = new Parent();
		
		Parent [] Electronic = new Parent[2];
		Electronic[0] = new Child2();
		Electronic[1] = new Child1();
		
		for(int i = 0; i < 2; i++) {
			Electronic[i].PowerOn();
			
		}
	}

}
