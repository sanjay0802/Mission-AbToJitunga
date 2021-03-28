package com.logic.abtojitunga.hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class ArryaListProblem {
	
	public static void main(String[] args) {
		
		
		  Scanner sc=new Scanner(System.in);
	        
	        int n=sc.nextInt();
	        
	        ArrayList[] bucket=new ArrayList[n];
	        
	        for(int i=0;i<n;i++){
	            
	            int d=sc.nextInt();
	            
	            bucket[i]=new ArrayList();
	            
	            for(int j=0;j<d;j++){
	                
	               bucket[i].add(sc.nextInt());
	            }
	            
	            
	        }
	        int q=sc.nextInt();
	        
	        for(int i=0;i<q;i++){
	            
	            int xLine=sc.nextInt();
	            int yPo=sc.nextInt();
	            
	            try{
	                
	                System.out.println(bucket[xLine-1].get(yPo-1));
	            }catch(Exception e){
	                System.out.println("ERROR!");
	            }
	            
	            
	        }
	        
	        
	    }
		
		
	}


