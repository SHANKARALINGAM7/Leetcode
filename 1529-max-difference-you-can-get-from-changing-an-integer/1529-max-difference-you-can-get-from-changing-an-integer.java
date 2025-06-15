class Solution {
    public int maxDiff(int num) {

     String s = String.valueOf(num);
        char max  = '9';
        char min = s.charAt(0);
        int count = 0 ,n =s.length();
        char y ='0';
        for(char c: s.toCharArray()){
            if(c != '1' && c != '0'){
                min = c;
                break;
            }
            else count++;
        }
        for(char c: s.toCharArray()){
            if(c != '9'){
                max = c;
                break;
            }
        }
    
        String s1 ="",s2= "";
        if(count == n || min == s.charAt(0))y = '1';
        // System.out.println(max+" "+min+" "+y);
        for(char c: s.toCharArray()){
             if(c == max){
                 s1 += '9';
             }
             else s1 += c;
             if(c == min){
                 s2 += y;
             }
             else s2 += c;
        }

      int sum1 = Integer.parseInt(s1);
      int sum2 = Integer.parseInt(s2);

        return sum1-sum2;

    }
}