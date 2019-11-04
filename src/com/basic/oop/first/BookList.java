package com.basic.oop.first;


/*
 * 1. 회원정보
 *  - ID : admin / PW : 1234
 *  - ID : user / PW : 5678
 * 2. 가능
 *   2-1. 로그인
 *        ㄴ 로그인한 회원이 admin이면
 *        	도서 목록조회 / 추가 / 삭제 / 수정가능
 *        ㄴ 로그인한 회원이 User면
 *        	도서목록 조회 만 가능
 * 
 * 
 * 
 */

import java.util.ArrayList;

public class BookList {
	private ArrayList<BookBase> Book_ArrList;
	
	public BookList() {
		Book_ArrList = new ArrayList<BookBase>();
	}
	
	public void addBook(String title, String Author, int Price) {
		BookBase temp = new BookBase(title, Author, Price);
		Book_ArrList.add(temp);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = new String("도서명\t\t 저자\t 가격\n");
		for(BookBase book : Book_ArrList) {
			str += book.toString();
		}
		return str;
	}
	
	
	
	
}
