class Solution {
    public List<String> removeAnagrams(String[] words) {
        int cur = 0;
        int n = words.length;
        List<String>l=new ArrayList<>();
        for(int i=1;i<n;i++){
             int a[] = toFrequency(words[cur]);
             int b[] = toFrequency(words[i]);

             if(! isValid(a,b)){
                  l.add(words[cur]);
                  cur = i;
             }
        }
        l.add(words[cur]);
        return l;

    }
    public int[] toFrequency(String s){
        int a[] = new int[26];
        for(char c : s.toCharArray()){
            a[c-'a']++;
        }

        return a;
    }
    public boolean isValid(int a[],int b[]){
        for(int i = 0;i < 26 ;i++){
            if(a[i] != b[i]){
                return false;
            }
        }

        return true;
    }
}