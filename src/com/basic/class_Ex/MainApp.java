package com.basic.class_Ex;

import java.util.Random;
import java.util.Scanner;

/*
 * 	클랙스 & 인스턴스
 * 
 * 	
 */
public class MainApp {

	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		Person wonjang = new Person();
		Scanner sc = new Scanner(System.in);
		Random R = new Random();
		
		
		
		Person test = new Person();
		test.m_sName = "누구";
		test.m_nAge = 100;
		//class -> Person
		//P1
		wonjang.m_sName = "An-dukja";
		wonjang.m_nAge = 55;
		
		System.out.println(wonjang.m_sName);
		System.out.println(wonjang.m_nAge);
		System.out.println(test.m_sName);
		System.out.println(test.m_nAge);*/
		
		//계산기
		Scanner sc = new Scanner(System.in);
								//JavaCompiler  --> 자동생성
		MyCalculator calc1 = new MyCalculator();
		MyCalculator calc2 = new MyCalculator(10,20);
		int x = 100;
		Random R = new Random();
		/*
		 * get, set 메서드를 작성
		 * 클래스 내부에서 자체 출력함수 작성
		 * 상속 이후 -> toString()
		 * 
		 */
		calc1.printData();
		calc2.printData();
		
		System.out.println(calc2.add());
		System.out.println(calc2.div());
		System.out.println(calc2.mul());
		
		
		//calc1.keepSumData(calc2);

		
	}

}
