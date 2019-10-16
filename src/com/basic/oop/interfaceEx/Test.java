package com.basic.oop.interfaceEx;
/*
 * 구성
 * MainApp.java(class)
 * Test.java   (class)
 * Queue.java (interface)
 * Stack.java (interface)
 * 
 * 인터페이스 활용
 *  - 두개의 인터페이스를 사용하는 클래스
 *  - ex) 두 인터페이스의 메세드 명칭이 동일 할 경
 *  - 검사검사 자료구조 살짝
 * 
 */
public class Test implements Stack{
	private int []Storage;
	final public static int Size = 5;
	private int index;
	private int enIndex;
	private int deIndex;
	
	public Test() {
		Storage = new int [Size];
		
	}
	
	public void Enqueue(int num) {
		enQueue(num, Storage, enIndex, deIndex, Size);
		
	}
	
	public int deQueue() {
		// 큐에 데이터가 비어 있으면 데이터 반화 X
		System.out.println("현재 출력 인덱스 : " + (deIndex + 1) % Size);
		System.out.println("현재 입력 인덱스 : " + enIndex);
		
		if(enIndex == deIndex) {
			System.out.println("Queue is Empty");
		}
		else{
			deIndex = (deIndex + 1) % Size;
			return Storage[deIndex];
		}
		return 0;
		
	}

	
	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if(isUnderflow(index) == Non_error) {
			index--;
			return Storage[index];
		}
		else {
			return Underflow;
			// return isUderflow(index);
		}
		// 생성후 바로 pop()
	}	
	@Override
	public void push(int data) {
		// TODO Auto-generated method stub
		// 현재 인덱스 번호가 4
		// push 실행시 -> overflow
		if(isOverflow(index, Size) == Overflow){
			return;
		}
		else {
			Storage[index] = data;
			index ++;
		}
		
		
	}

}
