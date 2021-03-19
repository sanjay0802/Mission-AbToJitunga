public static int birthdayCakeCandles(List<Integer> candles) {
    // Write your code here
              int count=0;
              int max=candles.get(0);
            for(Integer k:candles){
                if(k>=max){
                    max=k;
                }
                }
             for(Integer l:candles){
                 if(l==max){
                 count++;
                 }
             }   
                return count;
            }
    

    }
