package com.intro;


//finally

public class Test7 {
    public static void m2(){
    	try{
    	System.out.println(12/0);
    	}finally{
    		System.out.println("finally block code executed");
    		System.out.println();
    	}
    }
	public static void main(String[] args) {
		m2();

	}

}
