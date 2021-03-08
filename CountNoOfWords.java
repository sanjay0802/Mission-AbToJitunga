package com.logic.abtojitunga.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class CountNoOfWords {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Map<Character,Integer> hasmap=new HashMap<Character,Integer>();
		
		System.out.print("Enter the String :\n");
		
		String s=sc.next();

		char[] rev=s.toCharArray();
		
		for(int i=0;i<rev.length;i++) {
			 int count=0;
			if(hasmap.containsKey(rev[i])) {
				
				 count=hasmap.get(rev[i]);
				
				hasmap.put(rev[i], ++count);
					
				
			}else {
				hasmap.put(rev[i], ++count);
				
			}
			
		}
		
		for(Entry<Character,Integer> bucket:hasmap.entrySet()) {
			
			System.out.print(" Key: "+bucket.getKey());
			System.out.print(" Value: "+bucket.getValue());
			
			
		}
		
		
		
	}
	
	
	
}
