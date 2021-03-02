package com.logic.abtojitunga.string;

public class RotationOfString {

	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7};
		
		int i=0, k=2;
		
		while(i<k) {
			
			System.out.print(arr[arr.length-k]+i);
			i++;
		}
		
		
		while(k<arr.length) {
			
			System.out.print(arr[k-i]);
			k++;
		}
		
		
		
	}
	
	
}
