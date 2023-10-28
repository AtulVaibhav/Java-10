package com.intro;

import java.util.ArrayList;
import java.util.List;

//unchecked or runtime exception(logic)
public class Test3 {
   public static void m3(){
	   //1.ArithmeticException
	   //int result = 14/0;
	   //System.out.println(result);
	   
	   //2.NullPointerException
	  // String str=null;
	   //System.out.println(str.length());
	   
	   //3.ArrayIndexOutOfBoundsException
	   //int[] arr = new int[5];// 0-4
	   //System.out.println(arr[5]);
	   
	   //4.NuberFormatException
	   //String str = "123efg";
	   //System.out.println(Integer.parseInt(str));
	   
	   
	   //ClassCastException:
//	   List list = new ArrayList();
//	   list.add("efg");
//	   list.add(123);
//	   for(int i=0;i<list.size();i++){
//		    String data = (String) list.get(i);
//		    System.out.println(data);
//	   }
	   
	   
	   //5.StringIndexOfBoundsException
	   String str = "Java";
	   System.out.println(str.charAt(4));
	   
   }
	public static void main(String[] args) {
		m3();
		
		
		

	}

}
