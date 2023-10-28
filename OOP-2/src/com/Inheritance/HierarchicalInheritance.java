package com.Inheritance;


class Super{
	int data =1000;
}

class Subclass1 extends Super{
	 int data2 = 2000;
	 
	 public void getData3(Subclass2 obj){
		 System.out.println(obj.data3);
	 }
}

class Subclass2 extends Super{
	 int data3 = 3000;
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Subclass1 obj = new Subclass1();
		System.out.println(obj.data);
		System.out.println(obj.data2);
		
		Subclass2 obj2 = new Subclass2();
		
		obj.getData3(obj2);
		
		
		
		
		
		
		
		
		

	}

}
