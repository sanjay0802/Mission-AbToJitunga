static void miniMaxSum(int[] arr) {
        
         List<Long> list=new ArrayList<Long>();  

        
        for(int i=0;i<arr.length;i++){
            long sum=0;
            for(int j=0;j<arr.length;j++){
                  if(i==j){
                      continue;
                  }else{
                      sum=sum+arr[j];
                  }
                     
            }
                
            list.add(sum);   
        }
             long minSum=list.get(0); 
              
           for(Long value :list){
               if(value<minSum){
                   minSum=value;
               }
               
           }
           
           long maxSum=list.get(0);
           for(Long value :list){
               
               if(value>maxSum){
                   maxSum=value;
               }
           }
           
           
        System.out.print(minSum+" "+maxSum);

    }
