class Solution {
    public boolean reorderedPowerOf2(int n) {
        char ch[]=String.valueOf(n).toCharArray();
        Arrays.sort(ch);
        String num=String.valueOf(ch);
       
        for(int i=0;i<31;i++){
           int val=(int)Math.pow(2,i);
           if(num.length()==(int) (Math.log10(val) + 1)){
           char ch1[]=String.valueOf(val).toCharArray();
           Arrays.sort(ch1);
           String num1=String.valueOf(ch1);
           if(num.equals(num1)){
            // System.out.println(num+" "+i);
            return true;
           }
           }
        }
        return false;

    }
}