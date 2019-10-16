package com.basic.oop.interfaceEx;

public class Queue {
	final static int Non_error = -1;
	final static int QueueEmpty = 6000;
	final static int QueueFull = 7000;
// 전부 default method
	default void enQueue(int data, int [] Storage, int rear, int front, int Size) {
		//저장 공간에 데이터가 Full이면 입력 X
		//그외는 입력 O
		
		System.out.println("입력값 : " + data);
		System.out.println("현재 입력 인덱스 : " + (rear + 1) % Size);
		System.out.println("현재 출력 인덱스 : " + front);
		
		if((rear + 1) % Size == front) {
			System.out.println("Queue is Full");
			return;	
		}
		else {
			rear = (rear + 1) % Size;
			Storage[rear] = data;
			System.out.println("Storage[" + rear + "] =>" + data);
		}
	}
}