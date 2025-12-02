class Solution {
    public int countElements(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        if(k == 0)return n;
        Set<Integer>s=new HashSet<>();
        s.add(nums[n-1]);
        k--;
        for(int i = n-2;i>=0;i--){
            s.add(nums[i]);
            if(k == 0 && nums[i] != nums[i+1])return i+1;
            if(k>0)k--;
           
        }
        return 0;
      
    }
}