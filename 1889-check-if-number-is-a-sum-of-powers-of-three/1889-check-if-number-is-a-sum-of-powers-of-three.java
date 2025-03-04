class Solution {
    public boolean checkPowersOfThree(int n) {
        return(!Integer.toString(n,3).contains("2"));
    }
}