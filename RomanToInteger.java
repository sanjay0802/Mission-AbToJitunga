class Solution {
    public int romanToInt(String s) {
        
        int temOne=0;
        int temTwo=0;
        int ans=0;
            
        String s='XI'
        char[] charArray=s.toChaArray();
        
        
        for(int i=0;i<charArray.length-1;i++){
            
            temOne=getInt(charArray[i]);
            
            temTwo=getInt(charArray[i+1]);
            
            if(temOne<temTwo){
                
              ans=ans-temTwo; 
                
            }else{
                
                ans=ans-temOne;
            }
            
            
            
            
        }
        
       ans=ans+ getInt(arr[length-1]);
        
        
    }
    
    public int getInt(char i){
        
        switch(i)
        {
            case 'I' :  i=1;
                   break;
            case 'V' :  i=5;
        
                 break;
            case  'X' :  i=10;
                
               break;
            case  'L' : i=50;
        
                break;
            case  'C' : i=100;
        
                break;
             case  'D'  :   i=500;
                break;
                
            case 'M' :    i=1000;
                break;   
                
        
    }
        return i;
    
}