package com.basic.oop.abstNtempmethod;

public class MainApp {
	final static int SIZE = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//abstractBase BaseInstance = new AbstractBase();
		DerivationCls DerInstance = new DerivationCls();
		DerInstance.Method();
		
		System.out.println(SIZE);
		Car[] test = new Car[SIZE];
		test[0] = new AICar();
		test[0] = new ManualCar();
		
		test[0].startCar();
		test[0].drive();
		test[0].run();
		test[0].stop();
		test[0].turnOff();

	}

}
