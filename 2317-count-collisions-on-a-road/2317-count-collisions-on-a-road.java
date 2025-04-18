class Solution {
    public int countCollisions(String directions) {
        int right = 0,left = 0 ,ans = 0;
        boolean block = false;
        for(char ch : directions.toCharArray()){
            if(ch == 'S'){
                block = true;
                ans += right;
                right = 0;
            }
            else  if(ch == 'R'){
                right++;
                block = false;
            }
            else{
                if(right != 0){
                    ans += 2;
                    ans += right-1;
                    right = 0;
                    block = true;
                }
                else if(block){
                    ans += 1;
                }
            }
        }
        return ans;
    }
}