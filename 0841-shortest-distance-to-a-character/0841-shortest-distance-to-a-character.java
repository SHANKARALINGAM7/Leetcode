class Solution {
    public int[] shortestToChar(String s, char c) {
        List<Integer> occurence =new ArrayList<>();
        char ch[] = s.toCharArray();
        int n = ch.length,ind = 0;
        for(int i=0;i<n;i++){
            if(ch[i] == c){
                occurence.add(i);
            }
        }

        int len = occurence.size();
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
             if(ind<len-1 && Math.abs(occurence.get(ind)-i) >= Math.abs(occurence.get(ind+1)-i)){
                 ind += 1;
             }

             ans[i] = Math.abs(occurence.get(ind)-i);

        }

        return ans;
    }
}