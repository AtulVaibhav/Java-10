package com.polymorphism.runTime;
/**
 * Method Overriding: giving new implementation
 * Parent-child relationship
 * method signature must be same
 * 
 * 
 * 
 *
 */
class Parent{
	 public int calculation(int a,int b){
		 return a+b;
	 }
}
class Child extends Parent{
	@Override
	public int calculation(int a,int b){
		return a*b;
	}
}

public class Test {

	public static void main(String[] args) {
		//object
		Child ch = new Child();
		System.out.println(ch.calculation(12, 13));
		
		//Dynamic Dispatch:Parent type reference points to child type object
		
		Parent p = new Child();
		System.out.println(p.calculation(12, 14));
		
		
		
		

	}

}
