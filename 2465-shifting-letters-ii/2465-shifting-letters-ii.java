class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n=s.length();
        char ch[]=s.toCharArray();
        int [] arr=new int[n+1];
        for(int a[]:shifts){
            if(a[2]==0){
                 arr[a[0]]-=1;
                 arr[a[1]+1]+=1;

            }
            else{
                 arr[a[0]]+=1;
                 arr[a[1]+1]-=1;
            }
        }
        for(int i=1;i<=n;i++){
            arr[i]+=arr[i-1];
        }
        for(int i=0;i<n;i++){
        if(arr[i]>=0){
            arr[i]%=26;
        ch[i] = (char)((ch[i]-'a'+arr[i] + 26)% 26 + 'a');
        } 
        else {
            arr[i]*=-1;
            arr[i]%=26;
            ch[i] = (char)((ch[i]-'a'-arr[i] + 26)% 26 + 'a'); 
        }
        } 
        return String.valueOf(ch);

    }
   
}