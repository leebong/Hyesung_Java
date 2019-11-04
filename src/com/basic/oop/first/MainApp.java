package com.basic.oop.first;
/*
 * Collection Framwork
 * 자료구조를 라이브러리로 만들어 놓음
 * List 기반 : ArrayList / Vector / LinkedList
 * 
 * - 장점 : 구현 되어있기 때문에 작업이 불필요
 * - 단점 : 필요한 기능이 한 두개의 메서드 뿐인경우
 * 
 */

import java.util.ArrayList;

public class MainApp {
	// 프로그램 전체동작
	// Main : 도서관관리 프로그램 동작
	// 도서목록 : 도서관리
	// 회원목록 : 회원정보 관리
	// 단일 책임
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookBase book = new BookBase("도서명", "저자", 10000);
		BList.add(book);
		
		BookBase book1 = new BookBase("도서명", "저자", 10000);
		BList.add(book1);
		
		BookBase book2 = new BookBase("도서명", "저자", 10000);
		BList.add(book2);
		
		BookList bookList = new BookList();
		
		bookList.addBook("도서명", "저자", 10000);
		bookList.addBook("Java의 정석", "남궁성", 20000);
		bookList.addBook("Do it Java프로그램", "박은종", 30000);
		
		System.out.println(BList);
		System.out.println(bookList);
		
		
		
		
		
		
		
		
		
	}

}
