package com.logic.abtojitunga;

import java.util.Scanner;

public class ReadInputs {
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        
	        
	        int i = scan.nextInt();
	        double d=scan.nextDouble();
	        String s1=scan.nextLine();  //when user press enter it will store blank value..so to read
	        String s=scan.nextLine();   //input we need to read string again string
	        

	        // Write your code here.

	        System.out.println("String: " + s);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);
	    }

}
