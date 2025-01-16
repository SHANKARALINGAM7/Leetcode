class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int len1=nums1.length,len2=nums2.length;
        if(len1%2==0 && len2%2==0)return 0;
        else if(len1%2==1 && len2%2==1){
            return xor(nums1)^xor(nums2);
        }
        else{
            if(len1%2==0)return xor(nums1);
        }
        return xor(nums2);
    }

    public int xor(int arr[]){
        int ans=0;
        for(int i:arr)ans=ans^i;
        return ans;
    }
}