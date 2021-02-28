package com.logic.abtojitunga.string;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicate {

	public static void main(String[] args) {
	
		
		String s="Sanjay";
		
		String noDuplicate[]=new String[6]; 
		
		Map<String,Integer> bucket=new HashMap<String,Integer>();
		
		String str[]=s.split("");
		
		for(int i=0;i<str.length;i++) {
			int count=0;
			if(bucket.containsKey(str[i])) {
				continue;
				
			}else {
				bucket.put(str[i], ++count);
				noDuplicate[i]=str[i];
			}
			
		}
		
		for(int i=0;i<noDuplicate.length;i++) {
			if(noDuplicate[i]==null)
				continue;
				
			System.out.print(noDuplicate[i]);
		}
		
	}
	
	
	
}
