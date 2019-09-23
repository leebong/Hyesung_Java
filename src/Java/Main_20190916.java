package Java;

import java.util.Random;
import java.util.Scanner;

public class Main_20190916 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//com.naver.map.UI
		//com.naver :  어느회사
		//.map : 프로젝트
		//UI : 부분(대문자표기)
		
		/*
		 * swith ~ case 문
		 */
		
		
		/*String cInput = '\u0000';
		Scanner sc0 = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int w = 0;
				
		cInput = sc0.next();
		switch(cInput) {
		case 'w' :
			y++;
		}*/
		
		int nScore = 0;
		char cGrade = ' ';
		Scanner sc1 = new Scanner(System.in);
		System.out.println("점수 입력 >>");
		nScore = sc1.nextInt();
		
		switch(nScore/10){
			case 10:
			case 9 :
				cGrade = 'A';
				break;
			case 8 :
				cGrade = 'B';
				break;
			case 7 :
				cGrade = 'C';
				break;
			case 6 :
				cGrade = 'D';
				break;
			default :
				cGrade = 'F';
				break;
		}	
		
		switch(cGrade) {
		case 'A': case 'B': case 'C':
			System.out.println("휴 ~~ 살았다");
			break;
		case 'D': case 'F':
			System.out.println("죽었다");
			break;
		}
		
		/*
		 * switch ~ case문 예제	
		 */
		int number = 0;
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Input number >>");
		number = sc2.nextInt();
			
		switch(number){
			case 1:
				System.out.println("바나나");
				break;
			case 2:
				System.out.println("사과");
				break;
			case 3:
				System.out.println("배");
				break;
			case 100:
				System.out.println("수박");
				break;
		}
		
		
		/*
		 * Random객체생성
		 * 
		 */
		
		Random r = new Random();
		
		System.out.println("1.가위  2.바위  3.보자기 >> ");
		Random sc = null;
		int nUser = sc.nextInt();
		int nCom = r.nextInt(10);
		
		nCom = r.nextInt(3)+1;
		System.out.println("user : ");
		switch(nUser) {
			case 1: System.out.println("가위"); break;
			case 2: System.out.println("바위"); break;
			case 3: System.out.println("보"); break;
		}
		System.out.println(" vs com : ");
		switch(nCom) {
			case 1: System.out.println("가위"); break;
			case 2: System.out.println("바위"); break;
			case 3: System.out.println("보"); break;
		}
	}
}
