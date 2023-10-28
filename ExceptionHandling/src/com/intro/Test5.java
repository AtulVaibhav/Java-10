package com.intro;

//try with multiple catch

public class Test5 {
    public static void m1(){
    	try{
    		String str="23ef";
    		System.out.println(Integer.parseInt(str));//NumberformatException
    	}catch(ArithmeticException ae){
    		ae.printStackTrace();
    		System.out.println("Exception handled in 1st catch block");
    	}catch(NumberFormatException nfe){
    		//nfe.printStackTrace();
    		System.out.println("Exception handled in 2nd catch block");
    	}
    	System.out.println("Method completed");	
    	
    }
	public static void main(String[] args) {
		m1();

	}

}
