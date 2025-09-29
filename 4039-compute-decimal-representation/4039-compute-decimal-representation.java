class Solution {
    public int[] decimalRepresentation(int n) {
       int len = (int)(Math.log10(n))+1;
        int ans [] = new int [len];
        int mul = 1,ct = 0;
        while(n>0){
            if(n%10 != 0) ct++;
             ans[len-1] = n%10 * mul;
            len--;
            n /= 10;
            mul *= 10;
        }
       int arr[] = new int[ct];
       for(int i=ans.length-1;i>=0;i--){
          if(ans[i] != 0){
             arr[ct-1] = ans[i];
             ct--;
          }
       }
        return arr;
    }
}