 public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
         int sum1=0;    
         int sum2=0;
         int difference=0;
      for(int i=0;i<arr.size();i++){
          
          for(int j=0; j<arr.get(i).size();j++){
              
              if(i==j){
                  
               sum1=sum1 +arr.get(i).get(j);
                  
              }
             
              
          }
          
          sum2=sum2+arr.get(i).get(arr.get(i).size()-1-i);
      }
 
        difference=sum1-sum2;
        
        return Math.abs(difference);
    }