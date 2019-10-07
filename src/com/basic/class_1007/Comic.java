package com.basic.class_1007;

public class Comic extends Book {
	private String CM_Name;
	
	
	public String getCM_Name() {
		return CM_Name;
	}

	public void setCM_Name(String cM_Name) {
		CM_Name = cM_Name;
	}

	public Comic() {
		super();
	}
	
	public Comic(String Title, String Author, String Company, int Price, String Name) {
		super(Title, Author, Company, Price);
		CM_Name = Name;
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
