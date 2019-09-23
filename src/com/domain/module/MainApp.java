package com.domain.module;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int sc;
		int nAge = 0;
		int nPay = 0;
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Input your age > ");
		nAge = sc1.nextInt();
		
		nPay = nAge >= 20 ? 1250 /*출력문*/ : 860 /*출력문*/;
		if(nAge >= 70) {
			nPay = 0;
			System.out.println("노약자 보호");		
		}
		if(nAge >= 20) {
			nPay = 1250;
			System.out.println("성인입니다.");
		}
		else {
			nPay = 850;
			System.out.println("학생입니다.");
		}
		System.out.println(nAge + "세의 요금은 " + nPay + "원 입니다.");

	}

}
