package com.intro;

//throw :
public class Test8 {
   public static void getEvenPositive(int num){
	   if(num%2!=0 || num<0){
		   throw new ArithmeticException();
	   }else{
		   System.out.println(num);
	   }
   }
	public static void main(String[] args) {
		getEvenPositive(62);

	}

}
