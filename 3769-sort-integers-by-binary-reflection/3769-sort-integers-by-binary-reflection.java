class Solution {
    public int[] sortByReflection(int[] nums) {

        int n = nums.length;
        PriorityQueue<int[]> pq =  new PriorityQueue<>((a,b)->{
            if(a[1]==b[1]){
                return Integer.compare(a[0],b[0]);
            }
             return Integer.compare(a[1],b[1]);
        });

        for(int i:nums){
            int j = helper(i);
            pq.add(new int[]{i,j});
        }
        int answer[] = new int[n];
        int k = 0;
        while(pq.size()>0){
            int a[] = pq.poll();
            answer[k++] = a[0];
        }
        return answer;
    }

    public int helper(int n){
        String s = Integer.toString(n,2);
        boolean isFirst = true;
        int len = s.length();
        String ans = "";
        for(int i=len-1;i>=0;i--){
            char bit = s.charAt(i);
            if(bit == '0'){
                    if(!isFirst){
                       ans += "0";
                    }
            }
            else {
                isFirst = false;
                ans += "1";
            }
        }

        return Integer.parseInt(ans,2);

    }
}