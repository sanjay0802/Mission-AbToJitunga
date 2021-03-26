package com.logic.abtojitunga.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class Prime100Digit {

	
	 public static void main(String[] args) {
		 
		 Scanner sc=new Scanner(System.in);
		 
		 String n=sc.nextLine();
		 
		 BigInteger b=new BigInteger(n);
		 
		boolean b1= b.isProbablePrime(1);
		boolean b2= b.isProbablePrime(0);
		boolean b3= b.isProbablePrime(-1);
		
		
		if(b1==true && b2==true && b3==true) {
			System.out.println("Prime");
			
		}else {
			System.out.println("Not Prime");
		}
	}
	
}
