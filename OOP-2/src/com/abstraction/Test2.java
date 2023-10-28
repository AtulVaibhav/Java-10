package com.abstraction;

//keyword :interface
//methods: by default,all methods are public and abstract in nature.
//class implements interface
//interface extends interface
//interfaces can't be instantiated
// static methods
//default keyword

//variables: by default, all variables are public , static and final in nature

interface MyInterface{
	
	 int a = 20;
	 void m1();
	 public static void m2(){
		 System.out.println("m2 is called");
	 }
	 
	 public default void m3(){
		 System.out.println("m3 is called");
	 }
	 
}

class A implements MyInterface{

	@Override
	public void m1() {
		System.out.println("Hello Interface");
	}
	
	
	
}


public class Test2 {

	public static void main(String[] args) {
	  MyInterface in = new A(); 
	  MyInterface.m2();
	  System.out.println(MyInterface.a);//public and static
	  //MyInterface.a = 30; final 
	  

	}

}
