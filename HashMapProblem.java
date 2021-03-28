package com.logic.abtojitunga.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapProblem {
	public static void main(String []argh)
	{
        
         Map<String,Integer> map=new HashMap<String,Integer>();
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		 in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
            map.put(name,phone);
            
		}
		while(in.hasNext())
		{
            
			String s=in.nextLine();
            
            Integer value=map.get(s);
            if(value!=null){
                System.out.println(s+"="+value);
            }else{
                 System.out.println("Not found");
            }
        
        
		}
	}

}
