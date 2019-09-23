package com.basic.excontrol1;

public class Control_Ex01 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		/*
		 * 	for(A; B; C) -> 괄호 내부에 3가지 문장을 사용
		 * 	{
		 * 
		 * 	}
		 * 	A : 정수 변수를 선언(초기값)
		 * 	B : 최대 횟수를 이용한 비교식
		 * 	C : 초기값을 증가 / 감소 시키는 수식
		 * 	초기값으로 사용한 변수를 이용한 비교식이 참값이면 반복
		 * 
		 * 
		 */
		
		int i = 0;
		
		for(i = 0; i < 5; i++) {
			// 초기값에 사용된 변수 i를 사용할 수 있다.
			System.out.println("초기값 i의 현재값 : " + i);
			
		}
		System.out.println("반복 종료 후 i 값은? " + i);
		
		for(i = 5; i > 0; i--) {
			// 초기값에 사용된 변수 i를 사용할 수 있다.
			System.out.println("감소반복문 i 값 : " + i);
			
		}
		System.out.println("반복 종료 후 i 값은? " + i);
		
		
		
		/*for(int i = 0; i < 5; i++) {
			// 초기값에 사용된 변수 i를 사용할 수 있다.
			System.out.println("초기값 i의 현재값 : " + i);
			
		}
		
		for(int i = 5; i > 0; i--) {
			// 초기값에 사용된 변수 i를 사용할 수 있다.
			System.out.println("감소반복문 i 값 : " + i);
			
		}*/
		
		return;

	}

}
