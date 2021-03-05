package com.logic.abtojitunga.string;

import java.util.HashMap;
import java.util.Map;

public class FindSmallSubString {
	
	public String smallestsubStringWithAllCharacter(String str,String pattern) {
		
		if(str==null || pattern==null ||str.length()==0 || pattern.length()==0)
		{
			return "";
		
		}
		
		int matchedElement=0;
		int start=0;
		int minSubStringLength=Integer.MAX_VALUE;
		int minSubStringStart=0;
		
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(int i=0;i<pattern.length();i++) {
			
			map.put(pattern.charAt(i), map.getOrDefault(pattern.charAt(i),0)+1);
		}
		
		for(int end=0;end<str.length();end++) {
			
	       char currentChar=str.charAt(end);
	       
	       
	       if(map.containsKey(currentChar)) {
	    	   
	    	   map.put(currentChar, map.get(currentChar)-1);
	    	   
	    	   if(map.get(currentChar)>=0) {
		    	   matchedElement++;
		    	   
		       }
	    	  
	    	   
	       }
	       
	      while(matchedElement==pattern.length()) {
	    	  if(end-start+1<minSubStringLength) {
	    		  
	    		  minSubStringLength=end-start+1;
	    		  minSubStringStart=start;
	    	  }
	    	  
	    	  
	    	  char charAtStart=str.charAt(start++);
	    	  
	    	 if(map.containsKey(charAtStart)) {
	    		 
	    		 if(map.get(charAtStart)==0) {
	    			 
	    			 matchedElement--;
	    		 }
	    	map.put(charAtStart,map.get(charAtStart)+1)	; 
	    		 
	    	 }
	    	 
	    	  
	      }
			
			
		}
		
		if(minSubStringLength>str.length()) {
			
			return "";
		}
		
		return str.substring(minSubStringStart, minSubStringStart+minSubStringLength);
		
	}
	
	
	 	public static void main(String[] args) {
	 		
	 		String str="badebcaae";
	 		String pattern="aabc";
	 		
	 		FindSmallSubString findSmallSubString=new FindSmallSubString();
	 		String smallSubString=findSmallSubString.smallestsubStringWithAllCharacter(str,pattern);
	 		
	 		System.out.println("Smallest Substring :"+smallSubString);
	 		
	 		
	 		
	 		
			
		}
	
	
	

}
