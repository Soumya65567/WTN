package com.wipro.encapsulation;

public class Ex1 {
	public static void main(String[] args) {
		Author a=new Author("Durjoy Datta","dj123@gmail.com",'M');
		System.out.println(a.name);
		System.out.println(a.email);
		System.out.println(a.gender);
		Book b=new Book();
		b.setA(new Author("abc","abc@klu.in",'F'));
		b.setBname("Hey");
		b.setPrice(255);
		b.setQtyInStock(20);
		System.out.println("Bname:"+b.getBname());
		System.out.println("Price:"+b.getPrice());
		System.out.println("Quantity:"+b.getQtyInStock());
		System.out.println("Author Name:"+b.getA().name);
		System.out.println("Author mail:"+b.getA().email);
		System.out.println("Author gender:"+b.getA().gender);
		
	}
}


class Author{
	String name, email;
	char gender;
	Author(String name,String email,char gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
}
class Book{
	private String bname;
	private Author a;
	private double price;
	private int qtyInStock;
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	public Author getA() {
		return a;
	}
	public void setA(Author a) {
		this.a = a;
	}
	

	
	
}
