package com.logic.abtojitunga.hackerrank;

public class RepeatedString {
	
	public static void main(String[] args) {
		
		String s="aba";
		long n=10;
		
		long count=repeatedString(s,n);
		
		System.out.println("Count Of the String==="+count);
	}

	
	public static long repeatedString(String s,long n) {
		/*long count=0;
        int m=(int)n;
        int len=s.length();
         String[] str=s.split("");
         
        String[]  strArr=new String[m];
        
          int j=0;
       
     for(int i=0;j<m;i++){
         
         strArr[j]=str[i];
         if(i==len-1) {
        	 i=-1;
         }
         
         j++;
     }
     
     System.out.println("==StrArr Array"+strArr);
     for(int k=0;k<m;k++){
         if(strArr[k].equals("a")){
             count++;
             
             
         }
     }
    
    
    return count;
	*/	
		long count=0;
		
		
		for(char c:s.toCharArray()) {
			
			if(c=='a') {
				
				count++;
			}
		}
		
		long factor=(n/s.length());
		
		long rem=(n%s.length());
		
		count =count*factor;
		
		for(int i=0;i<rem;i++) {
			
			if(s.charAt(i)=='a') {
				
				count++;
			}
		}
		
	  return count;	
	}
}
