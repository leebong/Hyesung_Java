package com.basic.oop.ClassCls;

public class User {
	
	private String ID; 
	private String PW; 
	 	 
	public User() { 
	 	this.ID = new String(); 
	 	this.PW = new String(); 
	} 
	public User(String id, String pw) { 
	 	this.ID = new String(id); 
	 	this.PW = new String(pw); 
	} 
	@Override 
	public String toString() { 
		// TODO Auto-generated method stub 
	 	return "ID : " + this.ID + "  PW : " + this.PW; 
	} 


}
