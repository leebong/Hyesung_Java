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
		
		
		/*
		 * Person class를 참고해서
		 * 도서명, 저자, 출판사
		 * 가격을 멤버로 갖는 Book 클래스 작성
		 *  생성자  -> 매개변수 X, 각 멤버변수에 값을 저장하는 생성자
		 * 가격 getter / setter
		 * 객체 정보 출력 메서드
		 * 
		 * 
		 */
		System.out.println();
		Book Com1 = new Book("Do it 자바프로그래밍", "박은종" , "이지스퍼블리싱 ",25000);
		Book Com2 = new Book("자바의 정석", "남궁성" , "도우출판 ",32000);
		Book Com3 = new Book("일하지 않는 시간의 힘", "마릴린폴" , "청림출판 ",14000);
		
		Com1.PrintBook();
		System.out.println();
		Com2.PrintBook();
		System.out.println();
		Com3.PrintBook();
		
	}

}
