class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Set<Integer>s1=new HashSet<>();
        int min1=Integer.MAX_VALUE;
        for(int i:nums1){
            s1.add(i);
            min1=Math.min(min1,i);
        }

        int min2=Integer.MAX_VALUE;
        int flag=0;
        for(int i:nums2){
             if(s1.contains(i)){
                min2=Math.min(min2,i);
             }
             min2=Math.min(min2,Math.min(min1,i)*10+Math.max(min1,i));
        }
        return min2;
    }
}