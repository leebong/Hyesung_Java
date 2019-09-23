package com.basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nInput = 0;
		int [] nBinary =  new int [8];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 값을 넣어주세요 : ");
		
		nInput = sc.nextInt();
		for(int i = 0; i < 8 ; i++) {
			nBinary[i] = nInput %2; // 입력 값을 2로 나눈 나머지를 배열에 저장
			nInput /= 2; // 입력 값을 2로 나눈 몫을 입력 변수에 저장
			System.out.println("배열" + i + "번째 인덱스에 저장한 값 : " + nBinary[i]);
			System.out.println("연산 이후 nInput에 저장한 값 : " + nInput);
			
		}
		for(int i = 0; i < 8; i++) {
			System.out.println(nBinary[i]);
		}
		System.out.println();
		System.out.println("입력 값의 2진수 > b");
		for(int i = 0; i < 8 ; i++) {
			System.out.println(nBinary[7-i]);
		}
		//배열 객체를 사용해서 출력
		System.out.println(Arrays.toString(nBinary));
		System.out.println(Integer.toBinaryString(nInput));

	}

}
