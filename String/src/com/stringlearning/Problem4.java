package com.stringlearning;

public class Problem4 {
	public static void reverseOrder(String str){
		String rev="";
		String[] words = str.split(" ");
		for(String word:words){
			rev = rev +" "+getReverse(word);
		}
		System.out.println(rev);
	}

	private static String getReverse(String word) {
		StringBuffer buffer = new StringBuffer(word);
		buffer.reverse();
		return buffer.toString();
	}

	public static void main(String[] args) {
		String str = "Today is weekend class";
		reverseOrder(str);

	}

}
