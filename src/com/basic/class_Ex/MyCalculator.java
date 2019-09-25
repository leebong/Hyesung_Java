package com.basic.class_Ex;
/*
 * 	허가 하지 않은 정보접근을 막는다 -> private
 *  모든접근을 허가한다 -> public
 *  메서드 작성
 *  
 *  접근 제어자 결과의 타입 동작명칭( 매개변수 ){
 *  	동작내용
 *  	result 메서드의 결과 값
 *  }
 *  
 *  인스턴스를 초기화 하는 메서드(new 클래스 명칭()) ----> 디폴트 생성자
 *  
 */
public class MyCalculator {
	private int Left; //좌항
	private int Right; //우항
	private int [] arr;
	
	

	public MyCalculator() {
		//디폴트 생성자 -> 모든 타입에 맞는 0으로 초기화
		arr = new int [10];
		System.out.println("Constructor() called");
	}
	
	// 메서드 기능 추가 -> 매개변수 형태, 갯수를 바꿔서 다른 동작을 하는 동일 메서드
	// 메서드 오버로딩 -> 생성자 오버로딩
	public MyCalculator(int px, int py) {
		Left = px;
		Right = py;
		arr = new int [px + py];
		System.out.println("Constructor(int, int) called");
	}
	
	// void는 넘겨줄 값(return)이 없다는 것이다 
	public void printData() {
		System.out.println(Left + "  " + Right);
	}

	public int add() {
		int result = 0;
		result = Left + Right;
		return result;
	}
	
	public double div() {
		double result = 0.0;
		result = (double)Left / Right;
		return result;
	}
	
	public int mul() {
		int result = 0;
		result = Left * Right;
		
		return result;
		
	}
	
}
