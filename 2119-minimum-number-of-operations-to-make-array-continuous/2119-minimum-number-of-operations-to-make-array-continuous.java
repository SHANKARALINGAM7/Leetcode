class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        Set<Integer>s=new HashSet<>();
        for(int i:nums)s.add(i);
        int temp[]=new int[s.size()];
        int j=0;
        for(int i:s){
            temp[j++]=i;
        }
        Arrays.sort(temp);
        j=0;
        int ans=-1;
        for(int i=0;i<temp.length;i++){
            while(j<temp.length && temp[i]+n>temp[j])j++;
            ans=Math.max(ans,j-i);
        }
            return n-ans;
    }
}