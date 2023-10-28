package com.stringlearning;
// convert to Uppercase
public class Problem2 {
	
    public static String toUpperCase(String str){
    	String newString="";
    	for(int i=0;i<str.length();i++){
    		char ch = str.charAt(i);
    		int initial_val = ch;
    		int val = initial_val-32;
    		newString = newString+((char) val);
    		
    		
    	}
    	//System.out.println(newString);
    	return newString;
    }
	public static void main(String[] args) {
		String str = "java";
		toUpperCase(str);
		

	}

}
