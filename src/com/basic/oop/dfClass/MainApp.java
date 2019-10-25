package com.basic.oop.dfClass;
/*
 * 기본 클래스 - String < 상수 풀 (constant pool)
 * Object - hashcod /equals / ..etc
 * 
 * Class 클래스
 * 
 * 
 */
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("ddd");
		String str2 = "ccc";
		String str3 = new String("aaa");
		String str4 = "bbb";
		//com.basic.oop.package.cls.class @ 69f22431e
		System.out.println("dog를 생성한 str1 ->" + str1.hashCode());
		System.out.println("cat를 입력한 str2 ->" + str2.hashCode());
		System.out.println("dog를 생성한 str3 ->" + str3.hashCode());
		System.out.println("cat를 입력한 str4 ->" + str4.hashCode());
		
		System.out.println(str1.charAt(2));
		System.out.println(str1.chars());
		System.out.println("compare");
		// compareTo  --> 두 문자열이 같으면 0값 다르면 0이 아니값
		System.out.println(str4 + " cmp " + str3 + " => " + str4.compareTo(str3));
		System.out.println(str4 + " cmp " + str1 + " => " + str4.compareTo(str1));
		System.out.println(str4 + " cmp " + str2 + " => " + str4.compareTo(str2));
		System.out.println(str1.equals(str2));
		
		
		
		// str1 [d][o][g]
		// str2 [d][o][g]
		// - ____________
		//       0  0  0   ---> 0 값
		
		// str1 [d][o][g]
		// str2 [c][a][t]
		// - ____________
		//       1  2  3   0 이아닌 정수값 이 나온다
		
		
		//Objtest obj1 = new Objtest((100);
		//Objtest obj2 = new Objtest((100);
		
		//System.out.println("일반 객체");
		//System.out.println(obj1.hashCode());
		//System.out.println(obj2.hashCode());
		
		int number = 100;
		str4 = String.valueOf(number);
		System.out.println("number 값은 > " + str4);
		
		str3 = String.valueOf(3.141592);
		//생년월일 920505 년도 월일
		int birth = 920505;
		//int year = 1900 + birth/10000;
		//birth = birth % 10000;
		//int month = birth/100;
		//int date = birth % 100;
		
		String str_birth = new String();
		str_birth = String.valueOf(birth);  // "920505"
		
		
		int number1 = 0;
		number1 = Integer.valueOf(str_birth.charAt(0)) - '0'; // '9' -> 57  - 48
		System.out.println("이디냐 > " + number1);
		char T = '0';
		number1 = (int)T;
		System.out.println("어디냐 > " + number1);
		
		T = 'a' - 32;
		System.out.println(T);
		
		str1 = "hello world";
		char[] test = str1.toCharArray();
		System.out.println("문자열 배열 출력");
		for(int i = 0; i < 11; i++) {
			System.out.println(test[i] + " ");
		}
		
		System.out.println();
		System.out.println("문자열 배열 출력");
		for(int i = 0; i < 11; i++) {
			System.out.println(test[i] = 'A');
		}
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
