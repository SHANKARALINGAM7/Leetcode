class Solution {
    public int minMaxDifference(int num) {
        
        String s = String.valueOf(num);
        char max  = '9';
        char min = s.charAt(0);
        for(char c: s.toCharArray()){
            if(c != '9'){
                max = c;
                break;
            }
        }
        String s1 ="",s2= "";
        for(char c: s.toCharArray()){
             if(c == max){
                 s1 += '9';
             }
             else s1 += c;
             if(c == min){
                 s2 += '0';
             }
             else s2 += c;
        }

      int sum1 = Integer.parseInt(s1);
      int sum2 = Integer.parseInt(s2);

        return sum1-sum2;

    }
}