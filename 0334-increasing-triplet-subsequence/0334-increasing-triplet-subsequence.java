class Solution {
    public boolean increasingTriplet(int[] nums) {

        int n = nums.length;
        if(n<3)return false;
        int min=nums[0],max=nums[n-1];
        int prevMin[] = new int[n];
        int nextMax[] = new int[n];
        for(int i=1;i<n;i++){
           if(min<nums[i]){
              prevMin[i]=1;
           }
           else min=nums[i];
        }

        for(int i=n-2;i>=0;i--){
           if(max>nums[i]){
              nextMax[i]=1;
           }
           else max=nums[i];
        }

        for(int i=0;i<n;i++){
            if(prevMin[i] !=0 && nextMax[i] != 0)return true;
        }

        return false;

    }
}