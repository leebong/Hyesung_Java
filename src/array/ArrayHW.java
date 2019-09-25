package com.basic.array;

import java.util.Arrays;
import java.util.Scanner;

/*	GitHub 주소
 *   https://github.com/godls1650/JavaProgramming
 * 	
 *   <배열>을 이용한 2진수 변환프로그램 작성
 *    <입력> 은 0 ~ 255 까지
 *    배열은 총 8개의 인덱스를 갖는다.
 *    
 */
public class ArrayHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nInput = 0;
		int [] arr = new int [3];
		/*	new 연산자 동작 방식 
		 *   프로그램 실행 후에 Java 메모리에 정수 변수 [n] 개를 나열 해서 할당한다.
		 *   할당 된 메모리 영역에  new 연산자 뒤의 타입에 맞는 0값으로
		 *       ---> (int) 0 
		 *       메모리를 초기화 한다.
		 */
		
		System.out.println(arr[0]);
		System.out.println(Arrays.toString(arr));
		
		int [] nBinary = new int [8];
		System.out.print("0 ~ 255 사이 값 입력 > ");
		Scanner sc = new Scanner(System.in);
		
		nInput = sc.nextInt();
		for(int i = 0 ; i < 8 ; i++) {
			nBinary[i] = nInput% 2;// 입력 값을 2로 나눈 나머지를 배열에 저장
			nInput /= 2;// 입력 값을 2로 나눈 몫을 입력 변수에 재저장
			System.out.println("배열 " + i + "번째 인덱스에 저장한 값 : " + nBinary[i]);
			System.out.println("연산 이후 nInput에 저장된 값 : " + nInput);
		}
		for(int i = 0; i < 8; i++) {
			System.out.print(nBinary[i]);
		}
		System.out.println();
		System.out.print("입력 값의 2진수 > b");
		for(int i = 0; i < 8; i++) {
			System.out.print(nBinary[7-i]);
		}
		//배열 객체를 사용해서 출력
		System.out.println(Arrays.toString(nBinary));
		System.out.println(Integer.toBinaryString(nInput));
	}

}






