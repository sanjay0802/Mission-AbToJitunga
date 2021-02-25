package com.logic;

import java.util.HashMap;
import java.util.Map;

public class FirstOccOfCharacter {

	public static void main(String[] args) {
		String s="aaabbcddf";
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		String st[]=s.split("");
		  
		
		for(int i=0;i<st.length;i++) {
			
			  int count=0;
			if(map.containsKey(st[i])) {
				
				int value=map.get(st[i]);
				
				map.put(st[i], ++value);
			
				
			}else {
				map.put(st[i],++count);
				
			}
		
		}
		
		for(Map.Entry<String,Integer> entry :map.entrySet()) {
			
			if(entry.getValue()==1) {
				System.out.println("Key : "+entry.getKey()+" Value:"+entry.getValue());
				break;
			}
			
			
		
			
		}
		
		
		
	}
}
