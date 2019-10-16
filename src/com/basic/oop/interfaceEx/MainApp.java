package com.basic.oop.interfaceEx;

public class MainApp {
	public static void func1() {
		System.out.println("메서드 1호출");
	}
	public static void func2() {
		System.out.println("메서드 2호출");
		func1();
	}
	public static void func3() {
		System.out.println("메서드 3호출");
		func2();
	}
	public static int factorial(int number) {
		if(number != 1) {
			System.out.println(number);
			return number * factorial(number -1);
		}else 
			return 1;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//func3();
		//System.out.println(factorial(5));
		
		Test T = new Test();
		
		
		T.push(100);
		T.push(200);
		T.push(300);
		T.push(400);
		T.push(500);
		T.push(600);
		System.out.println("pop Data" + T.pop());
		System.out.println("pop Data" + T.pop());
		System.out.println("pop Data" + T.pop());
		System.out.println("pop Data" + T.pop());
		System.out.println("pop Data" + T.pop());
		System.out.println("pop Data" + T.pop());
		
		//enQueue
		System.out.println("========enQueue 출력값==========");
		T.Enqueue(10);
		T.Enqueue(20);
		T.Enqueue(30);
		T.Enqueue(40);
		T.Enqueue(50);
		T.Enqueue(60);
		//deQueue
		System.out.println("=========deQueue 출력값==========");
		System.out.println("출력 값 : " + T.deQueue());
		System.out.println("출력 값 : " + T.deQueue());
		System.out.println("출력 값 : " + T.deQueue());
		System.out.println("출력 값 : " + T.deQueue());
		System.out.println("출력 값 : " + T.deQueue());
		System.out.println("출력 값 : " + T.deQueue());
	}

}
