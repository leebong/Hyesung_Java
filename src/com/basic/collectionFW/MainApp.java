package com.basic.collectionFW;

import java.util.ArrayList;

/*
 * Package : com\basic\collectionFW
 * File : MainApp.java
 * Extends : None
 * 
 * Pair 구조(한쌍)
 *   (Key, values)
 * 
 */
public class MainApp {
	/*
	 * 프로그램 싱행 후 타입이 결정
	 * 	1. static (클래스) 메서드 --> 일반화 X
	 * 	2. 일반화 타입이 있다.
	 * 
	 */
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 
		//자료형 추론Double
		GenericEx test = new GenericEx("test", 0.32);
		
		//java 8 JDK 1.8
		//var list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		Object list3 = new ArrayList<Integer>();
		
		
		//var ---> Class cls = ArrayList<Integer>.getClass()
		//    ---> construct c = cls.getConstructor<int>();
		//var type ==> 자료형을 정하지 않음 참조형, 크기값
		
		      
		GenericEx<String> test1 = new GenericEx<String>("홍길동", "쉬는시간");
		GenericEx<Integer> test2 = new GenericEx<Integer>("이순신", 10);
		// Generic Type --> 참조형태
		
		System.out.println(test1.toString());
		System.out.println(test2.toString());
		
		
		// Generic Type ---> 참조형태
	} 
	*/
	
	public static void main(String[] args) {
		/*MyPair<String, Integer> p1 = new MyPair<String, Integer>();
		MyPair<String, String> p2 = new MyPair<String, String>();
		//정수, GenericEx<String>
		MyPair<Integer, GenericEx<String>> p3 
		= new MyPair<Integer, GenericEx<String>>();
		*/
		
		
		MyPair<String, Integer> D1 
		= new MyPair<String, Integer>("홍길동", 65);
		
		System.out.println(D1.toString());
		
		MyPair<String, Integer> Node1 
		= new MyPair<String, Integer>("누구세요", 65);
	
	}
	

}
