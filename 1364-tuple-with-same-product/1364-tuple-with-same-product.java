class Solution {
    public int tupleSameProduct(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int pdt=nums[i]*nums[j];
                hm.put(pdt,hm.getOrDefault(pdt,0)+1);
            }
        }
        int count=0;
        for(int i:hm.keySet()){
            if(hm.get(i)>=2){
                count+=hm.get(i)*(hm.get(i)-1)*4;
        }
        }
        return count;
    }
}