package com.stringlearning;
//find the length without using length()
public class Problem3 {
    public static void getLength(String str){
    	int count=0;
    	char[] arr = str.toCharArray();
    	for(char ch:arr){
    		count++;
    	}
    	System.out.println(count);
    }
	public static void main(String[] args) {
		String str = "Wikipedia";
		getLength(str);

	}

}
