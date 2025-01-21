class Solution {
    public int operation(int a,int b,String opr){
        if(opr.equals("+"))return a+b;
        else if(opr.equals("-"))return b-a;
        else if(opr.equals("*"))return a*b;
        return b/a;
    }

    public int evalRPN(String[] arr) {
        int n=arr.length;
        Stack<String>st=new Stack<>();
        st.push(arr[0]);
        for(int i=1;i<n;i++){
            if(arr[i].equals("+")||arr[i].equals("-")||arr[i].equals("*")||arr[i].equals("/")){
                int a=Integer.parseInt(st.pop());
                int b=Integer.parseInt(st.pop());
                int val=operation(a,b,arr[i]);
              //  System.out.println(a+" "+b+" "+val);
                st.push(String.valueOf(val));
            }
            else st.push(arr[i]);
        }
        System.out.println(st);
        return Integer.parseInt(st.pop());
    }
}