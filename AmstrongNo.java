package com.logic.abtojitunga;

public class AmstrongNo {

	
	public static void main(String[] args) {
		
	  int n=121;
	  
	   int temp=n;
	   int num=0;
	   
	   int c=0;
	  while(n>0) {
		  
		    num=n%10;
		  
		   c=c+ (num*num*num);
		  
		  n=n/10;
		  
		  
	  }
	  
		if(temp==n) {
			
			System.out.println("No is Amtrong");
		}else {
			System.out.println("No is  not Amtrong");
		}
		
		
	}
	
	
}
