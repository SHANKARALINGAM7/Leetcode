class Solution {
    public int longestValidParentheses(String s) {
        int max=0,n=s.length();
        char ch[]=s.toCharArray();
        int arr[]=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            if(ch[i]==')'){
              if(!st.isEmpty()){
                    arr[i]=1;
                    arr[st.pop()]=1;
            }
            }
            else st.push(i);
        }
        int sum=0;
        for(int i=0;i<n;i++){
          //  System.out.print(arr[i]+" ");
            if(arr[i]==1){
                sum++;
            }
            max=Math.max(max,sum);
            if(arr[i]==0) sum=0;
        }
        return max;
    }
}