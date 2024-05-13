package com.sunbeam;

//3. Write a function to sort employees by their salary.

public class que3 {
	private String name;
	private double salary;
	
	
	public void emp(String name, double salary)
	{
		this.name = name;
		this.salary=salary;
	}
	
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


	@Override
	public String toString() {
		return "que3 [name=" + name + ", salary=" + salary + "]";
	}
	
	public static void main(String[] args)
	{
		emp[] emps = {
				new emp("kanxi", 40000),
				new emp("raj", 30000),
				new emp("ritu", 50000),
				new emp()
		}
	}

}
