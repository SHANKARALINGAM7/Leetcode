class Solution {
    public int triangularSum(int[] nums) {
        List<Integer> l = new ArrayList<>();
        for(int i:nums){
             l.add(i);
        }
        while(l.size()>1){
            int len = l.size();
            List<Integer> subl = new ArrayList<>();
            for(int i=1;i<len;i++){
                   int val = l.get(i) + l.get(i-1);
                   subl.add(val%10);
            }
            l = subl;
        }

        int sum = 0;
        for(int i:l)sum += i;
        return sum;
    }
}