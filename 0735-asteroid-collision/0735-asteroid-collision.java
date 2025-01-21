class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer>st=new Stack<>();
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            if(st.isEmpty())st.push(arr[i]);
            else if(st.peek()>0 && arr[i]>0)st.push(arr[i]);
            else if(st.peek()<0 && arr[i]<0)st.push(arr[i]);
            else if(arr[i]>0){
                //System.out.println(arr[i]);
                      while(!st.isEmpty() && st.peek()<0 && Math.abs(st.peek())<arr[i]){
                        st.pop();
                      }
                      if(st.isEmpty() || (st.peek()>0 && arr[i]>0))st.push(arr[i]);
                      else if(Math.abs(st.peek())==arr[i])st.pop();
                     
            }
            else if(arr[i]<0){
                        st.push(arr[i]); 
            }
            //System.out.println(st);
        }
      int ans[]=new int[st.size()];
      int len=st.size();
      for(int i=0;i<len;i++)ans[i]=st.pop();
        return ans;
    }
}