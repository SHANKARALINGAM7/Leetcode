class Solution {
    public int countPalindromicSubsequence(String s) {
        int freq[]=new int[26];
        int count=0,n=s.length();
        char ch[]=s.toCharArray();
        for(int i=n-1;i>=0;i--){
             if(freq[ch[i]-'a']==0)freq[ch[i]-'a']=i;
        }
        for(int i=0;i<n-1;i++){
            if(freq[ch[i]-'a']==-1||freq[ch[i]-'a']==i||freq[ch[i]-'a']==i+1)continue;
            int arr[]=new int[26];
            for(int j=i+1;j<freq[ch[i]-'a'];j++){
                if(arr[ch[j]-'a']==0){
                    count++;
                    arr[ch[j]-'a']=1;
                }
            }
            freq[ch[i]-'a']=-1;
           
        }
        return count;
    }
}