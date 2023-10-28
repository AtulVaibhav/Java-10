package com.intro;

public class Test {
	
	public static void m1(){
		System.out.println("Print 1");
		System.out.println(12/0);
		System.out.println("Print 3");
		System.out.println("Print 4");
		System.out.println("method executed completely");
	}

	public static void main(String[] args) {
		m1();

	}

}
