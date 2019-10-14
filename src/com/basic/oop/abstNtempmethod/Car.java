package com.basic.oop.abstNtempmethod;

public abstract class Car {
	public abstract void drive(); //추상메서드
	public abstract void stop(); //추상 메서드
	
	public void startCar() {
		System.out.println("시동을 켭니다");
		
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	//final -> 마지막으로 정의 -> 패턴 디자인
	final public void run() {
		//오버 라이딩
		//다른 메서드를 통일한 순서(루틴)으로 호출하는 메서드
		startCar();
		drive();
		stop();
		turnOff();
		
	}
	
	/*
	 * 장점 : 코드를 중복해서 작성 할 필요 없음
	 * 		자식 클래스에서 완성 시키는 부담감소
	 * 		다른 객체 추가
	 * 
	 * 단점 : 상속 관계상 복잡성이 증가
	 * 
	 */
	
	/* 회원가입 (일반, vip, 기업)
	 * 1. 회원정보
	 * 2. 본인인증
	 * 3. 데이터베이스 저장
	 * 
	 * 
	 */
	

}
