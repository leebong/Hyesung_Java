/*
 * 작성자 : 이상봉
 * 작성일 : 2019-09-06
 * 내   용 : 자바연습
 */
package Java;

public class Main_20190906 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		int level;
		level = 0;
		
		System.out.println(level);
		
		char ch1 = '한';
		char ch2 = '\uD55C';
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		int a = 65;
		int b = -66;
		
		char a2 = 65;
		
		System.out.println((char)a);
		System.out.println((char)b);
		System.out.println(a2);
		
		double dnum = 3.14;
		float fnum = 3.14F;
		
		System.out.println(dnum);
		System.out.println(fnum);
		
		double ddnum = 1;
		for(int i = 0; i < 10000; i++) {
			ddnum = ddnum + 0.1;
			
		}
		System.out.println(ddnum);
		
		
		//사칙연산
		int num = 10;
		int num2 = 2;
		
		/*num = num + num2;
		num += num2;
		num = num - num2;
		num -= num2;
		num = num * num2;
		num *= num2;
		num = num / num2;
		num /= num2;
		num = num % num2;*/
		num %= num2;
		
		System.out.println(num);
		
		
		
		
	}

}
