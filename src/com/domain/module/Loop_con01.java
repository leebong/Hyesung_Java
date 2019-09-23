package com.domain.module;

import java.util.Scanner;

public class Loop_con01 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		int nInput = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("음수를 입력하세요 >>");
		nInput = sc.nextInt();
		
		if(nInput >= 0) {
			System.out.println("잘못 입력했습니다.");
			//return;
		}
		System.out.println("if종료 시");
		while(nInput >= 0) {
			System.out.println("(while)잘못 입력했습니다.");
			System.out.println("재입력> ");
			nInput = sc.nextInt();
			
		}

	}

}
