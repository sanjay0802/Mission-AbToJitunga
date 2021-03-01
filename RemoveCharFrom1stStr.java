package com.logic.abtojitunga.string;

import java.util.ArrayList;
import java.util.List;

public class RemoveCharFrom1stStr {

	public static void main(String[] args) {
		
		 char[] st1="iloveindia".toCharArray();
		 char[]  st2 ="in".toCharArray();
		 List<Character> list=new ArrayList<Character>();
		 		 
		 System.out.println("Length Of St1=="+st1.length);
		 System.out.println("Length Of St2=="+st2.length);
		 
		 for(int j=0;j<st1.length;j++) {
		 
			 list.add(st1[j]);
		 }
		 
		 System.out.println("List=="+list); 
		 for(int i=0;i<list.size();i++) {
			 
			 for(int j=0;j<st2.length;j++) {
				 
			 if(list.get(i)==st2[j]) {
				 
				 list.remove(i);
				 
			 }
			 } 
		 }
		 System.out.println("=========="+list);

}
		
		
	}
	

