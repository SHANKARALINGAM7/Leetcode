class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->b-a);
        for(int gift:gifts)pq.add(gift);
        while(k-->0){
            int n=pq.poll();
            pq.add((int)Math.sqrt(n));
        }
    
        long result = 0;
        while (pq.size()>0) {
            result += (int) pq.poll();
        }

        return result;
    }
}