package com.logic.abtojitunga.string;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionBasic {

    public static void main(String[] args) {
        
        try{
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        
        int c=(x/y);
        System.out.print(c);
        } 
    catch(InputMismatchException e){
         System.out.println("java.util.InputMismatchException");
    }catch(ArithmeticException e){
       System.out.println("java.lang.ArithmeticException: / by zero");

    }
}
}