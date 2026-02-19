class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
       
        int freq1[] = new int[101];
        int freq2[] = new int[101];
        Set<Integer>s=new HashSet<>();
        for(int i:nums1)freq1[i]++;

        for(int i:nums2){
            if(freq1[i] != 0) s.add(i);
            freq2[i]++;
        }

        for(int i:nums3){
           if(freq1[i] != 0 || freq2[i] != 0)s.add(i);
        }


         List<Integer> ans = new ArrayList<>(s);

         return ans;
    }
}