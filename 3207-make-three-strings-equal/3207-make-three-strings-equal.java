class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int n=s1.length(),m=s2.length(),k=s3.length();
        int i=0;
        if(s1.charAt(0)!=s2.charAt(0)||s2.charAt(i)!=s3.charAt(0))return -1;
        while(i<n && i<m && i<k){
            if(s1.charAt(i)!=s2.charAt(i)||s2.charAt(i)!=s3.charAt(i))break;
            i++;
        }
        return (n-i)+(m-i)+(k-i);
    }
}