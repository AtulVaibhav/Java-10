package com.polymorphism.compileTime;
/**
 * Method Overloading:
 * Methods should be in same class
 * Methods name should be same
 * Number of args must be different
 * If no.of args are same,then datatype must be different
 * By changing return type, we can't overload methods
 *
 */

class Dimension{
	public void area(int radius){
		System.out.println("Area of circle :"+Math.PI*radius*radius);
	}
	
	public void area(int length,int breadth){
		System.out.println("Area of rectangle :"+length*breadth);
	}
	
	public void area(long side){
		System.out.println("Area of square :"+ side*side);
	}
	
}
public class Test {

	public static void main(String[] args) {
		Dimension d = new Dimension();
		d.area(20L);
		d.area(10);
		d.area(12,13);

	}

}
