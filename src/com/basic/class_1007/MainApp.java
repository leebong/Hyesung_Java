package com.basic.class_1007;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book [] List = new Book[5];
		int selector =0;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			System.out.println("|1. 소설 |2. 전공 |3. 만화책 |4. 잡지 |");
			System.out.print("select >> ");
			selector = sc.nextInt();
			switch(selector) {
			case 1:
				List[i] = new Novel();
				break;
			case 2:
				List[i] = new Major();
				break;
			case 3:
				List[i] = new Comic();
				break;
			case 4:
				List[i] = new Magazine();
				break;
			}
			List[i].inputData();
		}

	}

}
