package com.encapsulation;

class ABC{
	private final int secretKey=1234;
	public int getSecretKey(){
		return secretKey;
	}
	
}



public class Test {

	public static void main(String[] args) {
		ABC obj = new ABC();
		//System.out.println(obj.secretKey);
		System.out.println(obj.getSecretKey());
	   //obj.secretKey = 4567;
		System.out.println(obj.getSecretKey());

	}

}
