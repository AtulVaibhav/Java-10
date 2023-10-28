package com.Inheritance;

class GP{
	int a = 100;

}

class ParentInfo extends GP{
	int b = 200;
}

class ChildInfo extends ParentInfo{
	int c = 300;
}


public class MultilevelInheritance {

	public static void main(String[] args) {
		ChildInfo ch = new ChildInfo();
		System.out.println(ch.a);
		System.out.println(ch.b);
		System.out.println(ch.c);

	}

}
