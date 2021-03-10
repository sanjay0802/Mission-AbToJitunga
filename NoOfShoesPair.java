package com.logic.abtojitunga.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NoOfShoesPair {
	
	
	
	public static void main(String[] args) {
		
		int n=9;
		int pair=0;
		
		int[] arr={1,2,3,4,5,6,7,2,9};
		
		pair=sockMerchant(n,arr);
		
		System.out.println("No of Pairs:"+pair);
		
		
	}
	
 static int sockMerchant(int n, int[] ar) {

         Map<Integer,Integer> bucket=new HashMap<Integer,Integer>();
        
        for(int i=0;i<n;i++){
            
           bucket.put(ar[i],bucket.getOrDefault(ar[i],0)+1);
            
        }
        
           int totalPair=0;
           int pair=0;
        for(Integer value:bucket.values()){
            
            if(value>1)
            {
               pair=value/2;
               totalPair= totalPair+pair;
            }
        }
        
        return totalPair;
      
    }

}
