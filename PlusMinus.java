static void plusMinus(int[] arr) {

              double posiValue=0;
              double negiValue=0;
              double zeroValue=0;
              double p,n,z;
                
           for(int i=0;i<arr.length;i++){
               
               if(arr[i]>0){
                  ++posiValue;
               } else if(arr[i]<0){
                 ++negiValue;  
               }else{
                  ++zeroValue; 
               }
               
           }   
             p=(posiValue/arr.length);
             n= (negiValue/arr.length);
             z=(zeroValue/arr.length);
             
          System.out.println(String.format("%.6f",p));
          System.out.println(String.format("%.6f",n));
          System.out.println(String.format("%.6f",z));

    }