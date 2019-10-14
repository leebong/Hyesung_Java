package com.basic.oop.abstNtempmethod;
/*
 * 추상 클래스
 * -> 하위 클래스를 만들어 내는 하나의 설계도면
 * 과 같은 클래스
 * 
 */
public abstract class AbstractBase {
	protected int NVariable;
	protected String SVariable;
	
	public AbstractBase() {
		//내용 없는 생성자.
	}
	
	public AbstractBase(int I, String S) {
		//
		NVariable = I;
		SVariable = S;
	}
	
	public void Method() { //일반 메서드
		System.out.println("부모 메서드");
	}
	//추상화 메서드
	public abstract void abs_Method();

}
