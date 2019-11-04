package com.basic.oop.retry;

public class Person {
	
	private int age;
	private String name;
	public static int Year = 2019;
	
	/*
	 * 
	 * 습관적으로
	 * 멤버변수
	 * 
	 * 생성자
	 * 
	 * S : 단일 책임 원칙
	 * ---> 클래스 내부에 문제는 클래스 내부에서 처리해라
	 * 
	 * O : Open Close Principle
	 *    개발폐쇄 원칙
	 *    -> 확장 할 것과 확정이 불 필요한 것을 구분
	 *    -> 두 모듈이 만나는 지점에 인터페이스 정의
	 * 멤버데이터 중 이름 값을 리턴시키는 메서드
	 * 
	 * 사람이라는 형태의 테이터를 사용하는 설명서
	 * 
	 * set -> 이름, 나이 -> setName()
	 * 		    나이              setAge()
	 * 		    이름            --> 분리
	 * 		    산탄총수술
	 * 
	 */
	
	
	public void set(String str, int n) {
		this.name = str;
		this.age = n;				
	}
	
	public void set(String str) {
		this.name = str;			
	}
	
	public void set(int n){
		this.age = n;
	}
	
	
	public int editAge() {
		this.age += 10;
		return this.age;
	}
	
	public static void Auto_Set(Person temp, int year) {
		if(year > Year) {
			Year = year;
			temp.age += 1;
			
		}
	}
	
	public String getName() {
		return name;
	}
	
	
	
	
	
	
	
	public Person() {
		//super()
		//this Person.getClass + hashcode()
		
	}
	
	public void inputPerson(String name, int age) {
		// 내정보 = 입력값
		// this <- com.basic.oop.retry.person@34e8f922
		this.name = name;
		this.age = age;
		
		
	}
	
	
	
	
	

}


