package com.basic.array;
/*  ������ (30�� ���� ) 
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
/*	2���� �迭 
 * 	�迭�� �ϳ��� �ε����� �迭�� �Ҵ�
 * 	* 2���� �迭 �̻��� �迭�� ������ �迭 
 *    �̶�� �Ѵ�.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int [5];
		//						�� , ��
		int [][] tarr = new int[5][3]; // -> �� �迭�� ���Ҵ� 5�� ���̴�.
		// 						��  5���� �迭�� ����Ų��.
		// ù��° �� �� ����Ѵ�.
		int [] arr2 = {10,20,30,40,50};
		int [][] tetris = {{0,0,0,0},{0,0,1,1},{0,1,1,0},{0,0,0,0}};
		
		System.out.println("tet ���");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j <4; j++) {
				switch(tetris[i][j]) {
				case 0:
					System.out.print(" ");
					break;
				case 1:
					System.out.print("�� ");
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
