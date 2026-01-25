class Solution {
    public int[] rotateElements(int[] nums, int k) {
        List<Integer> pos = new ArrayList<>();
        int n = nums.length;
        for(int i:nums){
            if(i >=0 ) pos.add(i);
        }
        int len = pos.size();
        if(len == 0) return nums;
        int move = k%len;
        int posArr[] = new int[len];
        int j = len -move;
        for(int i=0;i<len;i++){
             if(i-move < 0){
                  posArr[j] = pos.get(i);
                  j++;
             }
             else{
                posArr[i-move] =  pos.get(i);
             }
        }

        j=0;
        // System.out.println(Arrays.toString(posArr));
        for(int i=0;i<n;i++){
            if(nums[i] >=0){
                nums[i] = posArr[j];
                j++;
            }
        }

        return nums;
        
    }
}