package com.Inheritance;

class Base{
	int data = 100;
}

class Derived extends Base{
	int data = 200;//instance variable
	
	public void show(){
		//int data = 300;//local variable
		System.out.println(data);
        System.out.println(this.data);//200
        System.out.println(super.data);//100
	}
}



public class Inheritance {

	public static void main(String[] args) {
		new Derived().show();

	}

}
