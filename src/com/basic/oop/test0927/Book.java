package com.basic.oop.test0927;

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

public class Book {
	//생성자
	String m_sTitle;
	String m_sAuthor;
	String m_sCompany;
	int m_nPrice;
	
	public int getM_nPrice() {
		return m_nPrice;
	}

	public void setM_nPrice(int m_nPrice) {
		this.m_nPrice = m_nPrice;
	}

	public Book() {
		
		m_sTitle = null;
		m_sAuthor = null;
		m_sCompany = null;
		m_nPrice = 0;
		
		
	}
	
	public Book(String Title, String Author, String Company, int Price) {
		m_sTitle = new String(Title);
		m_sAuthor = new String(Author);
		m_sCompany = new String(Company);
		m_nPrice = Price;
		
	}
	
	public void PrintBook() {
		System.out.println("<<" + m_sTitle + ">>");
		System.out.println("저자명 : " + m_sAuthor);
		System.out.println("출판사 : " + m_sCompany);
		System.out.println("가   격 : " + m_nPrice + "원");
	}
	
	
	
	
	
	

}
