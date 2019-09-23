package com.basic.excontrol1;

import java.util.Scanner;

/*
 * 제어문 중첩 --> for()	{	for() {}	}
 * 
 */
public class Control_Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 반복시킨다 -> Iterator i
		/*for(int i = 0; i < 10; i++) { // i -> 0 ~ 9까지 중가하면서 (10획 반복)
			System.out.println("i : " + i);
			
			if(i % 2 == 1) {
				System.out.println("홀수");
			}
			else {
				System.out.println("짝수");
			}
		}*/
		
		/*for(int i = 1; i < 10; i++) { // i -> 0 ~ 9까지 중가하면서 (10획 반복)
			System.out.println(i + "단");
			
			for(int j = 1; j < 10; j++) {
				System.out.print("i = " + i + "	j = " + j + "    ");
				
				//구구단
				System.out.println(i + " X " + j + " = " + (i*j));
			}
			
		}*/
		
		/*
		 * 	*
		 *  **
		 *  ***
		 *  ****
		 *  *****
		 *
		 */
		char k = '*';
		
		/*for(int i = 0; i < 5; i++) {			
			for(int j = 0; j <= i ; j++) {				
				System.out.print(k);				
			}			
			
			System.out.println();
		}*/
		
		/*for(int i = 0; i < 5; i++) {			
			for(int j = 4-i; j > 0 ; j--) {				
				System.out.print(" ");				
			}
			for(int j = 0; j <= i ; j++) {				
				System.out.print(k);				
			}
			System.out.println();
		}*/
		
		/*for(int i = 0; i < 5; i++) {			
			for(int j = 5-i; j > 0 ; j--) {				
				System.out.print(k);				
			}
			for(int j = 0; j <= i ; j++) {				
				System.out.print(" ");				
			}
			System.out.println();
		}
		*/
		
		for(int i = 0; i < 5; i++) {			
			for(int j = 5; j > i ; j--) {				
				System.out.print(k);				
			}			
			System.out.println();
		}
		
		/*
		 * 	[화폐분리 프로그램]
		 * 	금액입력 > 237450
		 * 	5만원 1만원  5천원  1천원  500원 100원  50원   10원
		 *	 4    3   1    2   0    4    1    0
		 */
		/*Scanner sc = new Scanner(System.in);
		System.out.println("지갑에 얼마가 있나요 >>");
		int [] arr = new int[10];
		for(int i = 0; i < 10; i++) {
			arr[i] = (i+1)*10;
			System.out.println(i);
		}*/
		
	}

}
