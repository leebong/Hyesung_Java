package com.basic.array;

import java.util.Arrays;

public class CopyArray{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		int number2 = 0;
		int [] arr1 = new int[4];
		int [] arr3 = new int [4];
		// ������ ����  -> int []    <reference type>
		/*  arr1 ��  int 4���� ������ ������ ����Ű�� ����
		 *  ����ִ� ������ �����Ѷ� : null  ����� �ʱ�ȭ
		 */
		int [] arr2 = null;
		for(int i = 0; i < 4; i++) {
				arr1[i] = (i + 1) * 10;
		}
		System.out.println("arr1 > " + Arrays.toString(arr1));
		arr2 = arr1;
		System.out.println("arr2 > " + Arrays.toString(arr2));
		number = 20;
		number2 = number;
		System.out.println(number  + "    " + number2);
		number2 = 30;
		System.out.println(number  + "    " + number2);
		arr2[0] = 100;
		System.out.println("arr1 > " + Arrays.toString(arr1));
		System.out.println("arr2 > " + Arrays.toString(arr2));
		
		
		// ���� ����
		
		for(int i = 0; i < 4; i ++ ) {
			arr3[i] = arr1[i];
		}
		arr3[0] = 1000;
		System.out.println("arr1 > " + Arrays.toString(arr1));
		System.out.println("arr3 > " + Arrays.toString(arr3));
	}

}
