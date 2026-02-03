class Solution {
    public boolean isTrionic(int[] nums) {
        int p = 0, q = 0, n = 0;
        int len = nums.length;

        for(int i=1;i<len;i++){
            if(nums[i]>nums[i-1]){
                if(q>0){
                    n++;
                }
                else p++;
            }
            else if(nums[i]<nums[i-1] && p>0 && n==0){
                   q++;
            }
            else{
                // System.out.println(p +":"+q+":"+n);
                 return false;
            }
             

        }
        // System.out.println(p +" "+q+" "+n);
        return p>0 && q>0 && n>0;

    }
}