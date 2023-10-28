package com.intro;

public class Test6 {
    public static void m2(){
    	try{
    		System.out.println("Inside outer try block");
    		//case-1: when exception is in outer try block
    		
//    		String str = null;
//    		System.out.println(str.length());
    		try{
    			System.out.println("Inside inner try block");
    			//case-2 :When exception occurred in inner try
//    			String str = null;
//        		System.out.println(str.length());
    			
    			System.out.println(2/0);
    		}catch(NullPointerException ae){
    			System.out.println("Exception handled in inner catch block");
    		}	
    	}catch(Exception e){
    		System.out.println("Exception handled in outer catch block");
    	}
    	
    	System.out.println("Outside the nested try-catch");
    }
	public static void main(String[] args) {
	m2();	

	}

}
