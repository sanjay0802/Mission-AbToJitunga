package com.logic.abtojitunga.hackerrank;

import java.util.Scanner;

public class PasswordFormation {
private static final Scanner scan = new Scanner(System.in);

   public static String regularExpression() {
	   
	   String pwd="(^[a-zA-Z][0-9_|a-zA-Z]{7,29})";
	   
	   return pwd;
	   
   }

    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(PasswordFormation.regularExpression())) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }

}
