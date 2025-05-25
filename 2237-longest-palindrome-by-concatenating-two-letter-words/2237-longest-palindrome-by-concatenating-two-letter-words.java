class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String,Integer> hm = new HashMap<>();
        int maxOdd=0;
        for(String s :  words){
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        int ans = 0;
        for(String s : hm.keySet()){
            int val=hm.get(s);
             if(s.charAt(0) == s.charAt(1)){
                        if(val%2==0)ans += (2*val);
                        else{
                            if(maxOdd<=val){
                                if(maxOdd-1>=0)ans += (2*(maxOdd-1));
                                maxOdd=val;
                            }
                            else ans += (2*(val-1));
                        }
             } 
             else{
                 String rev= new StringBuffer(s).reverse().toString();
                 if(hm.containsKey(rev)){
                     ans += 2*(Math.min(val,hm.get(rev)));
                    
                 }
             }
        }

        return ans+(2*maxOdd);
    }
}