package com.logic.abtojitunga.hackerrank;

public class Anagram {

	public static void main(String[] args) {
		String a="anagram";
		String b="margana";
		
		boolean value=isAnagram(a,b);
		System.out.println("===="+value);
	}
	static boolean isAnagram(String a, String b) {
        // Complete the function
          
        
            char[] ch1=a.toCharArray();
            char[] ch2=b.toCharArray();
            
            char[] result=new char[ch2.length];
            
            for(int i=0;i<ch1.length;i++){
                for(int j=0;j<ch2.length;j++){
                    
                    if(ch1[i]==ch2[j])
                    {
                        result[i]=ch2[j];
                        break;
                    }
                    
                }
                
            }
            
             
             String first=String.valueOf(ch1);
             System.out.println("First:"+first);
             String second=String.valueOf(result);
             System.out.println("second:"+second);
             
             if(first.equalsIgnoreCase(second))
             
                return true;
        
             else {
             
             return false;}
    }
	
	
}
