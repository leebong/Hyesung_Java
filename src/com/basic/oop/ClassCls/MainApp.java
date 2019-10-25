package com.basic.oop.ClassCls;
/*
 *  class name : Class (P.378)
 *  Class 클래스의 역할 다른 클래스 정보를 저장
 *  멤버, 메서드 생성자
 */

import java.lang.reflect.Method;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Exception --> 모든 예외의 조상
		Class uCls = User.class;
		Contructor cs = uCls.getConstructor(new Class[] {String.class, String.class});
		User admin = (User) cs.newInstance("admin", "1q2w3e4r!");
		Method method = uCls.getMethod("toString");
		System.out.println(method.invoke(admin));
		
		
		
		
	

}
