package com.intro;

//checked exception
public class Test2 {
   public static void m2(){
	   //Class.forName("com.mysql.jdbc.Driver");//ClassNotFoundException
	   
	  // Thread.sleep(1000);//InterruptedException
	   
	  //  new Thread().join(); //InterruptedException
   }
	public static void main(String[] args) {
		m2();
	}

}
