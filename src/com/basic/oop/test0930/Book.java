package com.basic.oop.test0930;

/*
 * Static Member < class member > ----> static
 * 		  instance (객체) member   ----> X
 * m_sTitle --> B1 등 객체의 멤버
 * 
 * Book  클래스의 변수 Count;
 * "자바 프로그램밍 변수" --> 시스템 내부 총 책의 갯수
 * 프로그램 내부의 Book 객체가 총 몇개냐?
 */

public class Book {
	//멤버변수
	public static int Count; // 도서관 내부의 책 종류
	
	private String m_sTitle;
	private int m_nCount; //등록순서
	private String m_sAuthor;
	private String m_sCompany;
	public int m_nPrice;
	
	
	
	// 생성자
	public Book() {		
		m_sTitle = new String("NULL");
		m_sAuthor = "NULL";
		m_sCompany = "NULL";
		Count ++;
		m_nCount = Count;
			
					
	}
				
	public Book(String m_sTitle, String m_sAuthor, String m_sCompany, int m_nPrice) {			
		this.m_sTitle = new String(m_sTitle);
		this.m_sAuthor = m_sAuthor;
		this.m_sCompany = m_sCompany;
		this.m_nPrice = m_nPrice;
		Count ++;
		System.out.println("생성자 종료시  Count static 변수의 값 > " + Count);
		m_nCount = Count;
		//객체의 멤버        | 매개변수
					
	}

	public String getM_sTitle() {
		return m_sTitle;
	}

	public void setM_sTitle(String m_sTitle) {
		this.m_sTitle = m_sTitle;
	}

	public int getM_nCount() {
		return m_nCount;
	}

	public void setM_nCount(int m_nCount) {
		this.m_nCount = m_nCount;
	}

	public String getM_sAuthor() {
		return m_sAuthor;
	}

	public void setM_sAuthor(String m_sAuthor) {
		this.m_sAuthor = m_sAuthor;
	}

	public String getM_sCompany() {
		return m_sCompany;
	}

	public void setM_sCompany(String m_sCompany) {
		this.m_sCompany = m_sCompany;
	}

	public int getM_nPrice() {
		return m_nPrice;
	}

	public void setM_nPrice(int m_nPrice) {
		this.m_nPrice = m_nPrice;
	}
		
	public void pirntBook() {
		System.out.printf("static > %02d %02d. %-20s %-11s %-20s %d원\n",
				Count, m_nCount, m_sTitle, m_sAuthor, m_sCompany, m_nPrice );
	}
	

		

		

}
