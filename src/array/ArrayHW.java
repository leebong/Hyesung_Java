package com.basic.array;

import java.util.Arrays;
import java.util.Scanner;

/*	GitHub �ּ�
 *   https://github.com/godls1650/JavaProgramming
 * 	
 *   <�迭>�� �̿��� 2���� ��ȯ���α׷� �ۼ�
 *    <�Է�> �� 0 ~ 255 ����
 *    �迭�� �� 8���� �ε����� ���´�.
 *    
 */
public class ArrayHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nInput = 0;
		int [] arr = new int [3];
		/*	new ������ ���� ��� 
		 *   ���α׷� ���� �Ŀ� Java �޸𸮿� ���� ���� [n] ���� ���� �ؼ� �Ҵ��Ѵ�.
		 *   �Ҵ� �� �޸� ������  new ������ ���� Ÿ�Կ� �´� 0������
		 *       ---> (int) 0 
		 *       �޸𸮸� �ʱ�ȭ �Ѵ�.
		 */
		
		System.out.println(arr[0]);
		System.out.println(Arrays.toString(arr));
		
		int [] nBinary = new int [8];
		System.out.print("0 ~ 255 ���� �� �Է� > ");
		Scanner sc = new Scanner(System.in);
		
		nInput = sc.nextInt();
		for(int i = 0 ; i < 8 ; i++) {
			nBinary[i] = nInput% 2;// �Է� ���� 2�� ���� �������� �迭�� ����
			nInput /= 2;// �Է� ���� 2�� ���� ���� �Է� ������ ������
			System.out.println("�迭 " + i + "��° �ε����� ������ �� : " + nBinary[i]);
			System.out.println("���� ���� nInput�� ����� �� : " + nInput);
		}
		for(int i = 0; i < 8; i++) {
			System.out.print(nBinary[i]);
		}
		System.out.println();
		System.out.print("�Է� ���� 2���� > b");
		for(int i = 0; i < 8; i++) {
			System.out.print(nBinary[7-i]);
		}
		//�迭 ��ü�� ����ؼ� ���
		System.out.println(Arrays.toString(nBinary));
		System.out.println(Integer.toBinaryString(nInput));
	}

}






