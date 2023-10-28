
//reverse order of string
package com.stringlearning;

public class Problem1 {
    public static String reverseOrder(String str){
    	String reverse = "";
    	String[] words = str.split(" ");
    	for(String word : words){
    	 reverse = word +" "+reverse; 
    	}
    	//System.out.println(reverse);
    	return reverse;
    }
	public static void main(String[] args) {
		String str = "Today is Weekend class";
         // class Weekend is Today
		reverseOrder(str);
	}

}
