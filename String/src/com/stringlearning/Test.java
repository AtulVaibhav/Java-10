package com.stringlearning;

import java.util.ArrayList;
import java.util.List;

class Hello{
	int num=10;
	String data = "Java";
	@Override
	public String toString(){
		return this.data+this.num;
	}
}
public class Test {

	public static void main(String[] args) {
		//Immutability
//		String str = "Hello";
//		str.concat("World");
//		System.out.println(str);
//		System.out.println(str.hashCode());
//		
//		str = str.concat("World");
//		System.out.println(str);
//		System.out.println(str.hashCode());
		
		//Creating a string object
		//1.literals 
		//Object : toString()
//		String str2 = "Java";
//		System.out.println(str2);
//		
//		Hello hello = new Hello();
//		System.out.println(hello);
		
		String str_1 = "World";
		String str_2 = "world";
		
		// ==
		if(str_1== str_2){
			System.out.println("points to same location");
		}else{
			System.out.println("points to different location");
		}
		
		
		//String();
		String st1 = new String("Hello");
		String st2 = new String("Hello");
		
		
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		
		
		

	}

}
