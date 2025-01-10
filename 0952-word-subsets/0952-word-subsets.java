class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans=new ArrayList<>();
       int n=words1.length;
       int arr1[]=getArr(words2);
        for(int i=0;i<n;i++){
           int ct=0;
           int [] arr2=new int[26];
           for(char c:words1[i].toCharArray()){
            arr2[c-'a']++;
           }
           for(int j=0;j<26;j++){
             if(arr1[j]!=0 &&ct==0){
               if(arr1[j]>arr2[j])ct=1;
             }
           }
           if(ct==0)ans.add(words1[i]);
        
        }
        return ans;
    }

    public int[] getArr(String ch[]){
      
          int arr[]=new int[26];
          for(int i=0;i<ch.length;i++){
          int arr1[]=new int[26];
          for(char c:ch[i].toCharArray()){
            arr1[c-'a']++;
          }
          for(int j=0;j<26;j++)arr[j]=Math.max(arr[j],arr1[j]);
          }
          return arr;
    }
}