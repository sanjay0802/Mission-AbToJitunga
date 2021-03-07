package com.logic.abtojitunga.string;

import java.util.HashMap;
import java.util.Map;

public class AnagramOfString {
	
	
	public boolean anagramOrNot(String s1,String s2) {
		boolean anaGramOrNot=false;
		
		String[] cha1=s1.split("");
		
		String[] cha2=s2.split("");
		
		System.out.println("");
		
		if(cha1.length==cha2.length) {
			return anaGramOrNot=false;
		}else {
		
		int anaGram=0;
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		
		for(int i=0;i<cha1.length;i++) {
			
			int count=0;
			
		   map.put(cha1[i], ++count);
			
			
		}
		
		for(int j=0;j<cha2.length;j++) {
			
			if(map.containsKey(cha2[j])){
				anaGram++;
				System.out.println("Anagram=="+anaGram);
			}


		}
		
		
		if(cha1.length==cha2.length) {
			
			if(cha1.length==anaGram) {
				
				  return anaGramOrNot=false;
			}else {
			
			   return anaGramOrNot=false;
			}
			
		}else {
			return anaGramOrNot=false;
		}
		
		}
		
		
	}
	
	
	
	
public static void main(String[] args) {
	
	String s1="Amri";
	String s2="mAry";
	boolean anargram;
	
	AnagramOfString  anagramOfString=new AnagramOfString();
	
	anargram=anagramOfString.anagramOrNot(s1,s2);
	
	if(anargram) {
		System.out.println("String is Anagram");
		
	}else {
		System.out.println("String is not  Anagram");
	}
	
	
	
	
}
}
