package com.logic.abtojitunga.patterns;

public class TimeConversion {
	public static void main(String[] args) {
	
		String time="12:45:54PM";
		
		   String newTime=getTime(time);
		   
		   System.out.println("====NewTime"+newTime);
		
	}
		
	
	public static String getTime(String time) {
	StringBuilder sb=new StringBuilder();
	
	 String am=time.substring(8,10);
	 
	 String[] str=time.split(":");
	 
	if(am.equalsIgnoreCase("AM")) {
		
		for(int i=0;i<str.length;i++) {
			
			if(str[i].equals("12")) {
				if(str[i+1].equalsIgnoreCase("00")) {
				
				sb.append("00:00:00");
				
				break;
			}else {
				if(i==0) {
					sb.append("00:");
					
				} 
			}
				
			}else {
			
				sb.append(str[i]);
				sb.append(":");
			}
			
		}
	}else {
		
		for(int i=0;i<str.length;i++) {
		if(!str[i].equalsIgnoreCase("12")){
		   int time1=Integer.parseInt(str[0]);
		
		  int newTime=time1+12;
		  
		String pmTime=String.valueOf(newTime);
		if(i==0) {
		sb.append(pmTime);
		sb.append(":");
		}else {
			sb.append(str[i]);
			sb.append(":");
		}
		}else {
			System.out.println("=====");
			sb.append(str[i]);
			sb.append(":");
		}
	}
		
		
	}
	return sb.substring(0,8).toString();
}
}