package com.logic.abtojitunga.string;

public class ReverseStringWithRecursion {

	public static void main(String[] args) {
		
		String s="Sanjay";
		
		
		String str=reverseString(s);
		
		System.out.println("Reverse String is:"+str);
				
	}
	
	public static  String reverseString(String str) {
		
		
		if(str.length()<2)
			
			return str;
		
		
		
		return reverseString(str.substring(1))+str.charAt(0);
			
			
		
		
	}

}
