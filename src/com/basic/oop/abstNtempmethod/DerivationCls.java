package com.basic.oop.abstNtempmethod;

public class DerivationCls extends AbstractBase {
	private double Der_Var;
	public DerivationCls() {
		super();
	}
	
	public DerivationCls(int N, String S, double D) {
		super(N, S);
		Der_Var = D;
		
	}
	/*
	 * public void Method(){
	 * 일반적인 메서드는 오버라이딩 생성 가능
	 * 호출시 super.Method()를 실행
	 */
	public void Method(){
		super.Method();
		System.out.println("자식 클래스가 수정");
		//super.abs_Method();
	}
	
	public void abs_Method() {
		// 부모 클래스의 미안성 메세드르 강제로 완성
		System.out.println("자식 클래스");
	}
}
