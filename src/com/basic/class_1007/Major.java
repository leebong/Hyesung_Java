package com.basic.class_1007;

public class Major extends Book {
	private String MJ_Name;
	
		
	public String getMJ_Name() {
		return MJ_Name;
	}

	public void setMJ_Name(String mJ_Name) {
		MJ_Name = mJ_Name;
	}

	public Major() {
		super();
	}
	
	public Major(String Title, String Author, String Company, int Price, String Name) {
		super(Title, Author, Company, Price);
		MJ_Name = Name;
		
	}

	@Override
	public void pirntData() {
		// TODO Auto-generated method stub
		super.pirntData();
		
	}

	@Override
	public void inputData() {
		// TODO Auto-generated method stub
		super.inputData();
		
	}
	
	
	
	
	
	

}
