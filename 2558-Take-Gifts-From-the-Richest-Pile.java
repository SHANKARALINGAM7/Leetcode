class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->b-a);
        for(int gift:gifts)pq.add(gift);
        while(k-->0 && pq.size()>0){
            int n=pq.poll();
            pq.add((int)Math.sqrt(n));
        }
        Object[] remaining = pq.toArray();
        long result = 0;
        for (Object pile : remaining) {
            result += (int) pile;
        }

        return result;
    }
}