/*
 * 작성자 : 이상봉
 * 작성일 : 2019-09-06
 * 내   용 : 자바연습
 */
package Java;

import java.util.Scanner;

public class Main_20190909 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//콘솔에 입력한 글자를 가져오는 객체
		Scanner sc = new Scanner(System.in);
		
		int nAge = 0;
		boolean bFirst = false;
		boolean bSecond = false;
		boolean bResult = false;
		
		int nPay = 0;
		System.out.println("나이를 입력하세요 >");
		nAge = sc.nextInt();
		
		bSecond = nAge <8 ;
		bFirst = nAge >= 70;
		
		
		bResult = bFirst || bSecond;
		
		System.out.println(bResult);
		
		//삼항연산자 -> A ? B : C
		//A -> 참 거짓 값을 저장하는 변수나 수식
		//B -> A가 true 일 때 결과값 -> x = B
		//C -> A가 false 일 때 결과값 -> x = C
		nPay = bResult ? 0 : 2000;

	}

}
