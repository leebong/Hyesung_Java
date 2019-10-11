package com.basic.oop.abstractclass;

public class Child1 extends Parent {
	private int Capacity;
	
	public Child1() {}
	
	public Child1(int v, int p, int g, int l) {
		super(v,p,g);
		Capacity = l; //청소기 통 용량
		
	}

	@Override
	public void PowerOn() {
		// TODO Auto-generated method stub
		// 청소기 전원을 ON
	}

	@Override
	public void PowerOff() {
		// TODO Auto-generated method stub
		// 청소기 전원을 OFF
	}
	
	


}
