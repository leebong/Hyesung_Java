package com.basic.class_1007;

public class Magazine extends Book {
	private String MG_Name;
	
	
	
	public String getMG_Name() {
		return MG_Name;
	}

	public void setMG_Name(String mG_Name) {
		MG_Name = mG_Name;
	}

	public Magazine() {
		super();
	}
	
	public Magazine(String Title, String Author, String Company, int Price, String Name) {
		super(Title, Author, Company, Price);
		MG_Name = Name;
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
