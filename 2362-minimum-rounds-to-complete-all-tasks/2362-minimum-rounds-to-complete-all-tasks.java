class Solution {
    public int minimumRounds(int[] nums) {
          HashMap<Integer,Integer>hm=new HashMap<>();
           for(int i:nums){
               hm.put(i,hm.getOrDefault(i,0)+1);
           }
           int count=0;
           for(int i:hm.keySet()){
                int freq=hm.get(i);
                if(freq==1)return -1;
                count+=freq/3;
                if(freq%3!=0)count++;
           }
           return count;
    
    }
}