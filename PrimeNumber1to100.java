package com.logic.abtojitunga;

public class PrimeNumber {

public static void main(String[] args) {
	
	int n=100;
	int count=0;
	
	for(int i=2;i<=n;i++) {
			
	for(int j=2;j<=i;j++) {
		
		if(i==j) {
			 System.out.println(i);		
		}
		if(i%j==0) {
			
			break;
			
		}
		
		
	}
		
		
	}
	
	
}

}
