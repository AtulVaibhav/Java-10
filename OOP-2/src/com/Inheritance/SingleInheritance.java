package com.Inheritance;
/**
 * Inheritance  : IS-A
 * Parent class , Base class , Super class
 * Child  class , Derived class , Sub-class
 * 
 * keyword : extends
 * 
 * super : It always refer to Parent class
 * 
 * super keyword must be the first line inside constructor
 * 
 * Can we use this and super both in constructor at same time? NO
 */

class Parent{
//	int data = 100;
//	private int data2 = 200;
	
	Parent(){
		System.out.println("Parent constructor");
	}
//	Parent(int a){
//		System.out.println("Parent parameterized constructor");
//	}
	
	public void m1(){
		System.out.println("m1() is called");
	}
}

class Child extends Parent{
//	public void m1(){
//		System.out.println(data * 2);
//	}
	Child(){
//		super();
		System.out.println("Child constructor");
	
	}
	
	
}


public class SingleInheritance {

	public static void main(String[] args) {
		Child ch = new Child();
		
		//ch.m1();

	}

}
