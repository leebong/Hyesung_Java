package com.basic.oop.test0927;




public class Person {
	//생성자

	public int m_nAge;
	private String m_sName;
	
	/*getter & setter -> 메서드
	  1. 메서드의 결과로 나온 값이 필요한가 필요하지 않는가
	  값이 필요하다면 그 값의 타입이 메세드의 타입이 된다
	  값이 필요 없다면 메서드의 타입은 viod를 사용한다
	  콘솔창의 출력 커서 위치를 내가 우너하는 위치로 이동시키는 함수
	 void SetConsoleCursorPosition(HanDle, psition)
	*/
	
	

	public int getM_nAge() {
		return m_nAge;
	}

	public void setM_nAge(int m_nAge) {
		this.m_nAge = m_nAge;
	}

	public String getM_sName() {
		return m_sName;
	}

	public void setM_sName(String m_sName) {
		this.m_sName = m_sName;
	}

	
	
	
	public Person() {
		m_nAge = 0;
		m_sName = "NULL";
	}
	

	
	
	

	
	
	
	
	
}
