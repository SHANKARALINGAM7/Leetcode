class Solution {
    public boolean completePrime(int num) {
        
        String left = "";
        String right = "";
        char ch[] = Integer.toString(num).toCharArray();
        int len = ch.length;
        for(int i=0;i<len;i++){
             left += ""+ch[i];
             if(!isPrime(Integer.parseInt(left)))  return false;
        }
  
        for(int i=len-1;i>=0;i--){
             right = ch[i] +""+right;
             if(!isPrime(Integer.parseInt(right)))  return false;
        }

        return true;

    }

        boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }
}