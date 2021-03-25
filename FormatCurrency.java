package com.logic.abtojitunga.hackerrank;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class FormatCurrency {
	
	public static void main(String[] args) {
		
		double payment=1234.;
		String b="sanjay";
		
		 //   String s1=b.indexOf(i);
		
		NumberFormat nu=NumberFormat.getCurrencyInstance(Locale.US);          
        String us=nu.format(payment);
        Locale indiaLocale = new Locale("en","IN");
        NumberFormat ni=NumberFormat.getCurrencyInstance(indiaLocale);
        String india= ni.format(payment);     
        NumberFormat nc=NumberFormat.getCurrencyInstance(Locale.CHINA);          
        String china=nc.format(payment);   
        
        NumberFormat nf=NumberFormat.getCurrencyInstance(Locale.FRANCE);          
        String france=nf.format(payment);      
          
       // Write your code here.
       
       System.out.println("US: " + us);
       System.out.println("India: " + india);
       System.out.println("China: " + china);
       System.out.println("France: " + france);	
       
       
       

}
}