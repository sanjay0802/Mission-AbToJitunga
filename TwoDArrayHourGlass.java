package com.logic.abtojitunga.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TwoDArrayHourGlass {
	
	 private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int[][] arr = new int[6][6];

	        for (int i = 0; i < 6; i++) {
	            String[] arrRowItems = scanner.nextLine().split(" ");
	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	            for (int j = 0; j < 6; j++) {
	                int arrItem = Integer.parseInt(arrRowItems[j]);
	                arr[i][j] = arrItem;
	            }
	        }

	        int result = hourglassSum(arr);
	        System.out.println("Result===="+result);

	      
	        scanner.close();
	    }
	    

	
	 // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        
    	 int sum =0;
         
         int[] resultArray=new int[16];
         int count=0;
         int max=0;
         for(int i=0;i<4;i++){

             for(int j=0;j<4;j++){
                 
                 sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]
                      + arr[i+2][j+1]+arr[i+2][j+2];
                 
                 
                resultArray[count]=sum; 
                count++;
             }
             
             
             
         }
            max=resultArray[0];
         for(int k=0;k<16;k++){
             
             if(resultArray[k]>=max){
                 max=resultArray[k];
             }
             
             
         }

       return max;
}
}