static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        
        List<Integer> list =new ArrayList(2);
        int bobCount=0;
        int aliceCount=0;
        for(int i=0;i<a.size();i++){
            
            if(a.get(i)>b.get(i)){
                aliceCount++;
                
            }else if(a.get(i)<b.get(i))
            {
                 bobCount++;    
                
            }
            
        }
         list.add(aliceCount);
         list.add(bobCount);
          return list;
    }