package com.basic.collectionFW;
//다른 클래스에서 Generic Class 사용

public class MyNode<Key, Value> {
	private MyNode Next;
	private MyPair<Key, Value> Data;
	
	
	public MyNode() {
		Next = null;
	}
	
	public MyNode(Key k, Value v){
		Next = null;
		Data = new MyPair<Key, Value>(k, v);
	}

	public MyNode<Key, Value> getNext() {
		return Next;
	}

	public setNext(MyNode<Key, Value> next) {
		this.Next = next;
	}
	
	
	

}
