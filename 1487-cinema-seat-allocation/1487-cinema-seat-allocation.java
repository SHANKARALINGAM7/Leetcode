class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        
         Map<Integer,Set<Integer>> hm = new HashMap<>();
         for(int a[] : reservedSeats){
            hm.putIfAbsent(a[0],new TreeSet<>());
            hm.get(a[0]).add(a[1]);
         }
         int ans = (n-hm.size())*2;
         for(Set<Integer> s : hm.values()){
             int prev=0,count=0;
             if(!s.contains(2) && !s.contains(3) && !s.contains(4) && !s.contains(5)){
                 count++;
                  if(!s.contains(6) && !s.contains(7) && !s.contains(8) && !s.contains(9))count++;
             }
             else if(!s.contains(6) && !s.contains(7) && !s.contains(8) && !s.contains(9))count++;
             else if(!s.contains(4) && !s.contains(5) && !s.contains(6) && !s.contains(7))count++;
             ans+=count;
         }

         return ans;
    }
}