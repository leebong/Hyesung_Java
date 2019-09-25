package com.basic.array;
/*  다음주 (30일 까지 ) 
 * 
 *  4 0 0 0 0 0 0 1 1 	4 : user 
 *  1 0 1 1 1 2 0 0 0   0 : load
 *  1 0 1 0 0 0 1 0 1   1 : wall
 *  1 0 1 1 1 1 1 0 0   2 : trap
 *  1 0 0 0 0 0 1 1 0   3 : Goal
 *  1 0 1 1 1 0 1 0 0
 *  1 0 1 0 1 0 1 0 1
 *  0 0 1 0 1 0 1 0 1
 *  0 1 1 0 0 0 1 3 1
 */
public class TDArray {
/*	2차원 배열 
 * 	배열의 하나의 인덱스에 배열을 할당
 * 	* 2차원 배열 이상의 배열을 다차원 배열 
 *    이라고 한다.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int [5];
		//						행 , 열
		int [][] tarr = new int[5][3]; // -> 각 배열의 원소는 5개 씩이다.
		// 						ㄴ  5개의 배열을 가리킨다.
		// 첫번째 행 을 사용한다.
		int [] arr2 = {10,20,30,40,50};
		int [][] tetris = {{0,0,0,0},{0,0,1,1},{0,1,1,0},{0,0,0,0}};
		
		System.out.println("tet 출력");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j <4; j++) {
				switch(tetris[i][j]) {
				case 0:
					System.out.print(" ");
					break;
				case 1:
					System.out.print("■ ");
					break;
				
				}	
			}
			System.out.println();
		}
		
		
		tarr[0][0] = 10;
		tarr[0][1] = 20;
		tarr[0][2] = 30;
		
		tarr[1][0] = 15;
		tarr[1][1] = 25;
		tarr[1][2] = 35;
		
		tarr[2][0] = 100;
		tarr[2][1] = 200;
		tarr[2][2] = 300;
		int data = 0;
		for(int i = 0; i< 5; i++) {
			for(int j = 0; j < 3; j++) {
				tarr[i][j] = (++data) * 10;  	
			}
		}
		
	}

}
