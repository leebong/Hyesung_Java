package com.basic.array;

import java.util.Random;
import java.util.Scanner;

/*
 * int Rotto = 0;
		int []Rotto2 = new int[6];
		Random R = new Random();
		System.out.println(Rotto);
		System.out.println(Rotto2);// HashCode : ����ӽ� �޸� ��ġ 
		for(int x = 0; x < 6 ; x++) {
			Rotto2[x] = R.nextInt(45)+1;// (0 ~ 44  ) + 1
			// 1 ~ 45
			System.out.println(Rotto2[x]);
 * �迭 (Array)
 * 10���� ������ �Է¹޴� �迭�� �����ϰ�
 * 1 ~ 10 ���� �����͸� �ߺ�, ���� ���� �Է�
 * 
 * 1 ~ 10
 *  1,9,5,7,3,8,2,4,6,10
 * 
 * ���� �Դϴ�.
 *  1. 8�� �ε����� ���� �迭�� �����ϰ�
 *    ��� �ε����� 0 ���� �ʱ�ȭ �Ѵ�.
 *  
 *  2. �������� ������ 0 ~ 255 ������ ���� �Է��Ѵ�.
 *  
 *  3. �迭�� 0�� �ε��� ���� 
 *     �Է°��� 2�� ���� �������� �����Ѵ�.
 *     ������ �� �Է°��� 2�� ���� ���� �ٽ� �Է°��� ���� ��Ų��.
 *  
 *  4. 3�������� �Է°��� �������� ���� �� ���� �ݺ� �Ŀ�
 *    
 *     �迭�� 7���ε��� ���� 0���ε��� ���� ����Ѵ�.
 * a6c8d0e97527ddfeac
 * 
 */
public class ArrayBasic01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//Array   Number 
			int[] arr = new int[10];
			Random R = new Random();
			// 1~ 10 ���� ���� �� �Է� ( �ߺ� ����)
			for(int i = 0; i < 10; i++) {
				arr[i] = R.nextInt(10) + 1;
				for(int j = 0; j < i; j++) {
					if(arr[j] == arr[i]) {
						i--;
						break;
					}
				}	
			}
			// ���
			for(int i = 0; i < 10; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
}




