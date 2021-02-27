package com.logic.abtojitunga.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MaximunOccurOfChar {
public static void main(String[] args) {
	String str="lalit";
	
	String stArray[]=str.split("");
	
	Map<String,Integer> bucket=new HashMap<String,Integer>();
	
	for(int i=0;i<stArray.length;i++) {
		int count=0;
		if(bucket.containsKey(stArray[i])){
			 
			int value=bucket.get(stArray[i]);
			bucket.put(stArray[i],++value);
			
		}else {
			bucket.put(stArray[i],++count);
		}
		
	}
	   int max=0;
	   String maxKey=null;
	for (Map.Entry<String, Integer> entry : bucket.entrySet())
	{
	    String key = entry.getKey();
	    Integer value = entry.getValue();
	    if(value>max) {
	    	max=value;
	    	maxKey=entry.getKey();
	    }
	   
	   
	}
	 System.out.println("Maximun No Of Occurance:"+maxKey);
}
}
