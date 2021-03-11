package com.logic.abtojitunga.hackerrank;

public class CoutingValley {
	
	
	public static void main(String[] args) {
		
		String path="DDDUUUDDU";
		
		int steps=9;
		
		int noOfValley=getNoOfValley(path,steps);
		
		System.out.println("ValleyCount:"+noOfValley);

	}
	
	
  public static int getNoOfValley(String path,int steps) {
	  
	     int valleyCount=0;
	     int  altitude=0;
	     
	     for(int i=0;i<steps;i++) {
	    	 
	    	 if(path.charAt(i)=='U') {
	    		 altitude++;
	    		 
	    		 if(altitude==0) {
	    			 
	    			 valleyCount++;
	    		 }
	    		 
	    	 }else {
	    		 
	    		 altitude--;
	    	 }
	    	 
	    	 
	    	 
	    	 
	     }
	  
	  return valleyCount;
	  
	  
  }

}
