package com.intro;
//CustomException

class AgeVerificationFailedException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;
	AgeVerificationFailedException(String data){
		
		this.msg = data;
	}
	public String getMessge(){
		
		return this.msg;
	}
}

public class Test9 {
    public static void onLineVoting(int age){
    	if(age<18){
    		try{
    		throw new AgeVerificationFailedException("Age verification failed");
    		}catch(AgeVerificationFailedException a){
    			System.out.println(a.getMessge()) ;
    		}
    	}else{
    		System.out.println("Welcome to online voting");
    	}
    }
	public static void main(String[] args) {
		onLineVoting(15);

	}

}
