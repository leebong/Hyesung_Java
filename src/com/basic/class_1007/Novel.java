package com.basic.class_1007;

public class Novel extends Book {
	private boolean isShort;
	
		
	
	public boolean isShort() {
		return isShort;
	}

	public void setShort(boolean isShort) {
		this.isShort = isShort;
	}

	public Novel() {
		super();
	}
	
	public Novel(String Title, String Author, String Company, int Price, boolean Short) {
		super(Title, Author, Company, Price);
		isShort = Short;
	}

	@Override
	public void pirntData() {
		// TODO Auto-generated method stub
		super.pirntData();
		if(isShort)
			System.out.println("단편");
		else
			System.out.println("장편");
	}

	@Override
	public void inputData() {
		// TODO Auto-generated method stub
		super.inputData();
	}
	
	

}
