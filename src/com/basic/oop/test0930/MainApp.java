package com.basic.oop.test0930;

/*
 * 도서클래스 (지난주,지금 한 이거) 들 참고해서
 * 생성된 총 도서 갯수와
 * 각 도서 마다 연번(1,2,3,4,5,...)를 저장하고 출력하는 프로그램 작성
 * 
 * 출력예시
 * 1. 자바 프로그래밍 입문 박은종 이지스 퍼블리싱 22000 
 * 2. 자바의 정석 남궁성 도우출판 32000
 * 3. 사직서 나 출판사없음 0
 * 4. C언어 효성출판부 효성컴퓨터학원 50000원
 * 
 * 	 총 4 종의 도서
 * 
 */

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book B1 = new Book("자바 프로그래밍 입문", "박은종", "이지스퍼블리싱", 22000);
		Book B2 = new Book("자바의 정석", "남궁성", "도우출판", 32000);
		Book B3 = new Book("Python", "일본인", "제이펍", 22000);
		Book B4 = new Book("자료구조 알고리즘", "효성 출판부", "요 학원", 7000);
		
		System.out.println("총 " + Book.Count +"종");
		B1.pirntBook();
		B2.pirntBook();
		B3.pirntBook();
		B4.pirntBook();
		
		
		
	}

}
