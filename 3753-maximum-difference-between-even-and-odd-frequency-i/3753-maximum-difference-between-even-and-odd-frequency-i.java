class Solution {
    public int maxDifference(String s) {
        int n = s.length();
        int freq[] = new int[26];
        for(char c : s.toCharArray()){
             freq[c-'a']++;
        }
        int maxOdd = 0 ,minEven = n; 
        for(int i : freq){
             if(i == 0) continue;
             if(i%2==1){
                 maxOdd = Math.max(maxOdd,i);
             }
             else{
                 minEven = Math.min(minEven,i);
             }
        }
         
        return maxOdd-minEven;

    }
}