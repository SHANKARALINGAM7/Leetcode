class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int max = 0;
        for(int key:hm.keySet()){
             if(hm.containsKey(key+1)){
                 max = Math.max(max,hm.get(key)+hm.get(key+1));
             }
        }
        return max;
    }
}