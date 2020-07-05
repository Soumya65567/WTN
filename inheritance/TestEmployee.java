package com.wipro.inheritance;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setInsurance_no("a256");
		e.setName("John");
		e.setSalary(10000000);
		e.setYr(2018);
		System.out.println("Employee name:"+e.getName());
		System.out.println("Employee salary:"+e.getSalary());
		System.out.println("Employee joining year:"+e.getYr());
		System.out.println("Employee Insurance number:"+e.getInsurance_no());
		
	}
}