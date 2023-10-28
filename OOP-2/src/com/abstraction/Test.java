package com.abstraction;
//concrete method : methods having body {}
//abstract method : method doen't have body

//abstract class: a class may have one or more abstract methods
//abstract classes can't be instantiated(object can't be created)
// abstract class can have concrete method also.
abstract class Employee{
	public abstract String typeOfEmployee(String name);
	public String compnayName(){
		return "ABC Pvt Ltd.";
	}
}

class FTE extends Employee {

	@Override
	public String typeOfEmployee(String name) {
		// TODO Auto-generated method stub
		return name+" :Full-Time Employee";
	}
	
}

class PTE extends Employee{

	@Override
	public String typeOfEmployee(String name) {
		// TODO Auto-generated method stub
		return name+" :Part-time Employee";
	}
	
}

public class Test {

	public static void main(String[] args) {
		
		Employee emp = new FTE();//Dynamic dispatch or Runtime polymorphism
		System.out.println(emp.typeOfEmployee("Rahul"));
	}

}
