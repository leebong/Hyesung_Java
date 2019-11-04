package com.basic.oop.first;

public class BookBase {
	protected String m_sTitle;
	protected String m_sAuthor;
	protected int m_nPrice;
	
	public BookBase() {
		m_sTitle = new String();
		m_sAuthor = new String();
	}
	
	public BookBase(String title, String author, int Price) {
		m_sTitle = new String(title);
		m_sAuthor = new String(author);
		m_nPrice = Price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String Info = new String();
		Info += (m_sTitle + "\t"); //제목 + tab
		Info += (m_sAuthor + "\t"); // 저자 + tab
		// (string)가격 + 엔터
		Info += (String.valueOf(m_nPrice) + "\n");
		//제목 저자 가격
		return Info;
	}
	
	
	
}

