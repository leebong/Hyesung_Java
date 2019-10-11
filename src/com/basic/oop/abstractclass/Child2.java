package com.basic.oop.abstractclass;

public class Child2 extends Parent{
	private int Refresh_Rate; //주사윯
	private int [] Aspect_Ratio; //화면비율
	
	public Child2() {
		Aspect_Ratio = new int [2];
	}
	
	public Child2(int v, int p, int g, int PR, int AR_h, int AR_v) {
		super(v,p,g);
		Refresh_Rate = PR;
		Aspect_Ratio = new int [2];
		Aspect_Ratio[0] = AR_h;
		Aspect_Ratio[1] = AR_v;
	}

	@Override
	public void PowerOn() {
		// TODO Auto-generated method stub
		// 모니터 전원을 ON
	}
	
	@Override
	public void PowerOff() {
		// TODO Auto-generated method stub
		// 모니터 전원을 OFF
	}
	

}
