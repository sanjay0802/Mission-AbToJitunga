package com.logic.abtojitunga.string;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateChar {
  public static void main(String[] args) {
	  
	  
	  String str="sanjay yadav";
	  
	   String str1=str.toUpperCase();             
	   
	  Map<Character,Integer> bucket=new HashMap<Character,Integer>();
	  
	  char ch[]=str.toCharArray();
	  
	  for(int i=0;i<ch.length;i++) {
		  int count=0;
		  
		  if(bucket.containsKey(ch[i])) {
			  
			  int value=bucket.get(ch[i]);
			  
			  bucket.put(ch[i],++value);
		  }else {
			  
			  bucket.put(ch[i],++count);  
		  }
		  
	  }
	  
	  for(Map.Entry<Character,Integer> start:bucket.entrySet()) {
		  
		  if(start.getValue()>1) {
			  
			System.out.println("Duplicate Key:"+start.getKey());  
		  }
	  }
	  
	  
	  
	
}
}
