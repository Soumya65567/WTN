package com.wipro.inheritance;

public class Employee extends Person {
	double salary;
	int yr;
	String insurance_no;
	String name=super.name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getYr() {
		return yr;
	}
	public void setYr(int yr) {
		this.yr = yr;
	}
	public String getInsurance_no() {
		return insurance_no;
	}
	public void setInsurance_no(String insurance_no) {
		this.insurance_no = insurance_no;
	}
	
}
