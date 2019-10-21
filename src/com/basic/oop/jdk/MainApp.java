package com.basic.oop.jdk;

import java.util.Vector;

/*
 * 
 * clone() --> 객체를 복제해서 객체를 반환
 * 일반화 프로그래밍
 * 	Generic --> 타입을 미정
 */
public class MainApp {

	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub
		
		MyInteger number = new MyInteger(10);
		Vector<String> arr = new Vector<String>();
		int num2 = 10;
		System.out.println(number + "입니다.");
		System.out.println(num2 + "입니다.");

		
		
		
		TestCls T = new TestCls(10000); //T.number = 10000
		TestCls Cur = T;
		
		TestCls T2 = new TestCls(200);
		TestCls Cur2 = new TestCls(T2);
		
		TestCls T3 = new TestCls(350);
		TestCls Cur3 = (TestCls)T3.clone();
		
		System.out.print("T와 Cur은 같은 객체입니까 >>");
		System.out.println(T == Cur);
		
		System.out.print("T와 Cur은 같은 객체입니까 >>");
		System.out.println(T2 == Cur2);
		
		
		
		
		
		
		
		System.out.println(Cur);
		System.out.println(T);
		System.out.println(T2);
		
		System.out.println(T == T2);
		System.out.println(T.equals(T2));
		
		
		Cur.setNum(1000);
		System.out.println(T.getNum());
		
	}

}
