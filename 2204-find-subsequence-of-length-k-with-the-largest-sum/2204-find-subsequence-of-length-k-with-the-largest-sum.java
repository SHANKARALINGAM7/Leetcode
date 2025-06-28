class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int ans [] =  new int[k];
        int arr[] = nums.clone();
        Arrays.sort(nums);
        int n = nums.length,j=0;
        HashMap<Integer,Integer>hm = new HashMap<>();
        int x=n-k;
        while(x<n){
            hm.put(nums[x],hm.getOrDefault(nums[x],0)+1);
            x++;
        }
        // System.out.println(hm);
        for(int i:arr){
          if(hm.getOrDefault(i,0)>0){
            ans[j++] = i;
            hm.put(i,hm.get(i)-1);
          }
        }
        return ans;
    }
}