package com.logic.abtojitunga.hackerrank;

public class JumpingOnCloud {
public static void main(String[] args) {
	
	int[] c= {0,1,0,0,0,1,0};
	
	int n=c.length;
	int count=-1;
	
	
	for(int i=0;i<n;i++,count++) {
		
		if(i<n-2 && c[i+2]==0) {
			
			
			i++;
			
		}
		
		
	}
	System.out.println("Count:"+count);
	
	
}
	
	
	
}
