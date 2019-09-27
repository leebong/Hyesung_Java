package com.basic.oop.test0927;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person P = new Person();
		int Test = 0;
		Test = 100;
		Test = P.getM_nAge();
		System.out.println("P의 나이 : " + Test);
		Test = 20;
		System.out.println("Test의 값을 변경");
		System.out.println("test 변수 값 : " + Test);
		System.out.println("실제 P의 나이 : " + P.m_nAge);
		
		Test = 20;
		P.setM_nAge(Test);
		System.out.println("setAge (20) 이후");
		System.out.println("P 인스턴스의 m_nAge 값");
		// P.m_nAge = 100; <- 외부 클래스에서 Person 클래스데이를 변경X
		// Person 클래스 자신의 메서드를 이용해서 변경
		String sText = P.getM_sName();
		sText = sText + " Bug";
		
		System.out.println(sText);
	}

}
