package com.logic.abtojitunga.hackerrank;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ListOperation {
	  
	        
		  public static void main(String[] args) {
		        
		        Scanner sc=new Scanner(System.in);
		        
		        int n=sc.nextInt();
		        
		        LinkedList<Integer> bucket=new LinkedList<Integer>();
		        
		        for(int i=0;i<n;i++){
		         int d=sc.nextInt();
		            
		          bucket.add(d);
		            
		        }
		        
		        int q=sc.nextInt();
		        for(int j=0;j<q;j++){
		            
		           String s=sc.next();
		           
		            if(s.equals("Insert")){
		                 
		                int x=sc.nextInt();
		                int y=sc.nextInt();
		                
		                bucket.add(x,y);
		                
		            }else if(s.equals("Delete")){
		                int x1=sc.nextInt();
		                bucket.remove(x1);
		            }
		            
		            }
		             
		        for(int value:bucket){
		            System.out.print(value+" ");
		        }
		        
		        
		        
		    }
}
