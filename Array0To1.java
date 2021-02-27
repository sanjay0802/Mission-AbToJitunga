package com.logic.abtojitunga;

public class Array0To1 {

	public static void main(String[] args) {
		int[] arr = {0 ,1, 0,1,0,0,1,1};
		int[] newArray=new int[8];
		int[] arr1=new int[4];
		
		
	 int k=0;
	  
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==1) {

				newArray[k]=arr[i];
				k++;
			}
		}	
		
		for(int m=0;m<newArray.length;m++) {
			System.out.print(newArray[m]);
		}
		
	
		}
		
		
		
	}

