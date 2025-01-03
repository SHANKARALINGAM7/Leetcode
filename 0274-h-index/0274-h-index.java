class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int count=0,n=citations.length,j=1;
        for(int i=n-1;i>=0;i--){
            if(citations[i]>=j++)count++;
            else break;
        }
        return count;
    }
}
