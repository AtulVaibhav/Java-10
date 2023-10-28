package com.stringlearning;

import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		String str = "Java";
		//length():
		System.out.println(str.length());
		
		//charAt(i)
		System.out.println(str.charAt(1));
		
		//indexOf
		System.out.println(str.indexOf('a'));
		
		//split
		String str2 = "Java is a language";
		//String[] arr = str2.split(" ");
		//for(String data:arr){
			//System.out.println(data);
			for(int i=0;i<str2.length();i++){
				System.out.println(str2.charAt(i));
			}
		
		
		//trim()
		String str3 = "     Java  is  lang.    ";
		System.out.println(str3);
		System.out.println(str3.trim());
		
		//== :location
		//.equals : content
		
		String str4 = "Hello";
		String str5 = "Hello";
		System.out.println(str4.equals(str5));
		
		
		

	}

}
