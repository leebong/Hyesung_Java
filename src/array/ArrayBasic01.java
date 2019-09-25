package com.basic.array;

import java.util.Random;
import java.util.Scanner;

/*
 * int Rotto = 0;
		int []Rotto2 = new int[6];
		Random R = new Random();
		System.out.println(Rotto);
		System.out.println(Rotto2);// HashCode : 가상머신 메모리 위치 
		for(int x = 0; x < 6 ; x++) {
			Rotto2[x] = R.nextInt(45)+1;// (0 ~ 44  ) + 1
			// 1 ~ 45
			System.out.println(Rotto2[x]);
 * 배열 (Array)
 * 10개의 정수를 입력받는 배열을 생성하고
 * 1 ~ 10 까지 데이터를 중복, 순서 없이 입력
 * 
 * 1 ~ 10
 *  1,9,5,7,3,8,2,4,6,10
 * 
 * 숙제 입니다.
 *  1. 8개 인덱스를 갖는 배열을 생성하고
 *    모든 인덱스를 0 으로 초기화 한다.
 *  
 *  2. 정수형태 변수에 0 ~ 255 사이의 값을 입력한다.
 *  
 *  3. 배열의 0번 인덱스 부터 
 *     입력값을 2로 나눈 나머지를 저장한다.
 *     저장한 후 입력값을 2로 나눈 몫을 다시 입력값에 저장 시킨다.
 *  
 *  4. 3번과정을 입력값이 나눠지지 않을 때 까지 반복 후에
 *    
 *     배열을 7번인덱스 부터 0번인덱스 까지 출력한다.
 * a6c8d0e97527ddfeac
 * 
 */
public class ArrayBasic01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//Array   Number 
			int[] arr = new int[10];
			Random R = new Random();
			// 1~ 10 까지 랜덤 값 입력 ( 중복 제거)
			for(int i = 0; i < 10; i++) {
				arr[i] = R.nextInt(10) + 1;
				for(int j = 0; j < i; j++) {
					if(arr[j] == arr[i]) {
						i--;
						break;
					}
				}	
			}
			// 출력
			for(int i = 0; i < 10; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
}




