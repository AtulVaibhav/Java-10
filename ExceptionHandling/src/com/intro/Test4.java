package com.intro;

import java.util.Scanner;

//try-catch
public class Test4 {
    public static void m1(){
    	
    	try{
    		//logical code
    		
    		String str = null;
        	System.out.println(str.length());
    		
    		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter two numbers");
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		System.out.println(a/b);
    	}catch(Exception ex){
    		System.out.println("Exception handled here");
    		ex.printStackTrace();
    		
    	}
    		
    		System.out.println("Method complete");
    		
    	
    }
	public static void main(String[] args) {
		m1();

	}

}
