class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        int n=wall.size(),max=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++){
            int num=0;
               for(int j=0;j<wall.get(i).size()-1;j++){
                num+=wall.get(i).get(j);
                hm.put(num,hm.getOrDefault(num,0)+1);
                max=Math.max(max,hm.get(num));
               }
               //System.out.println(hm);
        }
       
         return n-max;
    }
}