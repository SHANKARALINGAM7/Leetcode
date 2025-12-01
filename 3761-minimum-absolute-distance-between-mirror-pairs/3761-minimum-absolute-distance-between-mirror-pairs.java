class Solution {
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n =  nums.length;
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){

            if(hm.containsKey(nums[i])){
                ans = Math.min(ans,i - hm.get(nums[i]));
            }
            int rev = reverseDigit(nums[i]);
            hm.put(rev,i);
        }
        return ans ==  Integer.MAX_VALUE ? -1 : ans;
    }

    public int reverseDigit(int n){
         int num = 0;
         while(n>0){
            int rem = n%10;
            num = num*10 + rem;
            n /= 10;
         }
         return num;
    }


}