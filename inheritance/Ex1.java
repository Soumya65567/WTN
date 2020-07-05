package com.wipro.inheritance;

public class Ex1 {
	public static void main(String[] args) {
		Animal a=new Animal();
		a.eat();
		a.sleep();
		Bird b=new Bird();
		b.fly();
		b.eat();
		b.sleep();
	}
}

class Animal{
	void eat()
	{
		System.out.println("Animal eat method");
	}
	void sleep()
	{
		System.out.println("Animal sleep method");
	}
}
class Bird extends Animal{
	void fly()
	{
		System.out.println("Birds can fly");
		
	}
	void eat()
	{
		System.out.println("Bird eat method");
	}
	void sleep()
	{
		System.out.println("Bird sleep method");
	}
	
}