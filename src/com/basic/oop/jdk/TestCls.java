package com.basic.oop.jdk;
/*
 * 기본클래스 (표준 클래스, 표준 라이브러리
 * -> Java 개발시 완성되어있던
 * Object --> 모든 클래스의 상위에 존재하는
 * 기본 메서드(default)
 *  명령어 class --> implements
 *  extends (X)
 */

public class TestCls {
	
	
	private int number;
	public TestCls() {
		
	}
	
	public TestCls(int n) {
		number = n;
	}
	
	public TestCls(TestCls obj) {
		this.number = obj.number;
	}

	/*@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = new String();
		str = "멤버 변수 값은 ";
		System.out.println(super.toString());
		str += Integer.toString(number); // "멤버 변수 값은" + "10000"
		return str;
		//메서드 결과 특정 문자열을 반환한다
		//toString(), this
	}*/

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode() % 100;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if(this == obj)
			return true;
		else
			return false;
		
	}
	
	public void setNum(int x) {
		this.number = x;
	}
	
	public int getNum() {
		return this.number;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	

}
