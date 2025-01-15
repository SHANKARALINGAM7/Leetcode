class Solution {
    public int minimizeXor(int num1, int num2) {
        int count=Integer.bitCount(num2);
        char ch1[]=Integer.toString(num1,2).toCharArray();
        char ch2[]=new char[32];
        int j=31,k=ch1.length-1;
        for(j=31;j>=0 && k>=0;j--){
            ch2[j]=ch1[k--];
        }
        while(j>=0)
            ch2[j--]='0';
     //   System.out.println(count);
       // System.out.println(String.valueOf(ch2));
        for(int i=0;i<32;i++){
            
          if(count>0 && ch2[i]=='1'){
            ch2[i]='2';
            count--;
            
          }
        }
     //   System.out.println(String.valueOf(ch2)+" "+count);
        for(int i=31;i>=0;i--){
        if(ch2[i]=='1')ch2[i]='0';
        else if(count>0 && ch2[i]=='0'){
            ch2[i]='1';
            count--;
          }
          if(ch2[i]=='2')ch2[i]='1';
        }
        String ans=String.valueOf(ch2);
     //   System.out.println(ans);
        return Integer.parseInt(ans,2);
    }
}