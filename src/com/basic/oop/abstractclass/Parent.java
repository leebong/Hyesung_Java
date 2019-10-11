package com.basic.oop.abstractclass;
/*
 * 부모 클랙스의 메서드를 미완성 형태로 종결? 시킨다.
 *  ---> 추상화(Abstract) 명령어(접두어)
 *  부모클래스와
 *  추상화 시킬 메서드에 사용한다.
 *  
 *  
 */
public abstract class Parent {
	protected int Voltage;
	protected int Price;
	protected int Grade;
	
	public Parent() {}
	
	public Parent(int v, int p, int g) {
		Voltage = v;
		Price = p;
		Grade = g;		
	}
	
	public abstract void PowerOn();
	public abstract void PowerOff();
	
	public int getVoltage() {
		return Voltage;
	}
		
	
}
