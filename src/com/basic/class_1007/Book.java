package com.basic.class_1007;

import java.util.Scanner;

public class Book {
	protected String Title;
	protected String Autor;	
	protected String Company;
	protected int Price;
	
	
	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public Book() {
		this.Title = "NULL";
		this.Autor = "NULL";
		this.Company = "NULL";
		this.Price = 0;
		
	}
	
	public Book(String Title, String Author, String Company, int Price) {
		this.Title = Title;
		this.Autor = Author;
		this.Company = Company;
		this.Price = Price;
		
	}
	
	public void pirntData() {
		System.out.printf("%-20s %-15s %-15s %d,%03d원",
				this.Title, this.Autor, this.Company,
				this.Price/1000, this.Price%1000);
	}
	
	public void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("도서명 : ");
		this.Title = sc.next();
		System.out.print("저   자 : ");
		this.Autor = sc.next();
		System.out.print("출판사 : ");
		this.Company = sc.next();
		System.out.print("가   격 : ");
		this.Price = sc.nextInt();
		
	}
	
	
	
	

}
