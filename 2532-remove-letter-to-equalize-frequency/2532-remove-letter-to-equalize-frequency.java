class Solution {
    public boolean equalFrequency(String s) {
        int freq[] = new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        int j=0;
        for(int i:freq){
            if(i != 0){
                hm.put(i,hm.getOrDefault(i,0)+1);
                j=i;
            }
           
            if(hm.size()>2)return false;
        }
        // System.out.println(j);
        if((hm.size()==1 && hm.get(j)==1)||(hm.size()==1 && j==1))return true;
        int max = 0,min=s.length();
        for(int k:hm.keySet()){
            if(k==1 && hm.get(k)==1){
                return true;
            }
            max = Math.max(max,k);
            min = Math.min(min,k);
        }
        
        return (hm.get(max)==1 && (max-min)==1);
    }
}