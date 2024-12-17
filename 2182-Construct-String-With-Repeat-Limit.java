class Solution {
    public String repeatLimitedString(String s, int limit) {
        int arr[]=new int[26];
        char ch[]=s.toCharArray();
        for(char c:ch){
            arr[c-'a']++;
        }
        StringBuffer sb=new StringBuffer();
        int i=25,prev=25,flag=0;
        while(i>=0){
            if(arr[i]==0){
                i--;
                if(flag==0)prev--;
            }
            else if(flag==1){
                sb.append((char)(i+'a'));
                arr[i]--;
                flag=0;
                i=prev;
            }
            else if(flag==0){
                int count=0;
                while(count<limit && arr[i]>0){
                    sb.append((char)(i+'a'));
                    arr[i]--;
                    count++;
                }
                if(arr[i]!=0){
                    flag=1;
                    prev=i;
                    i--;
                }
            }

        }
        return sb.toString();
          }
}