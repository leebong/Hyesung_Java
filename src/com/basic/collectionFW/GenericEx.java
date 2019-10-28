package com.basic.collectionFW;
/*
 * Package : com\basic\collectionFW
 * File : Generic.java
 * Extends : None
 * ----------------------
 * Generic Programming
 *    > 일반화 프로그래밍
 *    해당 클래스는 일반적으로 아래 정의한 동작을 실행한다.
 *    일반적 -> 데이터 형태에 상관없이
 * 	 T ---> Template
 */

public class GenericEx<T> {
	private String m_sName; //이름
	private T subject; // 1
	

//Generic 클래스명 <타입 대신 쓸 단어>

	public GenericEx() {
		m_sName = new String();
		subject = null;
			
	}
	
	public GenericEx(String s, T ran) {
		m_sName = new String();
		subject = ran;
			
	}
	
	//동적할당 --> new 연산자외는 사용 X
	public T getSub() {
		return this.subject;
	}
	
	public void setSub(T r) {
		T t = r;
		this.subject = t;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
	
	
}