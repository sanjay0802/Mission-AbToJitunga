package com.logic.abtojitunga.string;

public class ReverseStringWithPreserveSpace {
	public static void main(String[] args) {
		
	
	String str="I am not String";
	
	  char[] chArray=str.toCharArray();
	  
	  char[] resultArray=new char[chArray.length];
	  
	  
	  for(int i=0;i<chArray.length;i++) {
		  
		  if(chArray[i] == ' ') {
			  
			  resultArray[i]=' ';
		  }
		  
		  
	  }
	
	  int j=resultArray.length-1;
	  
	  for(int i=0;i<chArray.length;i++) {
		  
		  if(chArray[i]!=' ') {
			  
			  if(resultArray[j]==' ') {
				  j--;
			  }
			  
			  resultArray[j]=chArray[i];
			  j--;
		  }
		  
		  
	  }
    System.out.println(String.valueOf(resultArray));
}
}