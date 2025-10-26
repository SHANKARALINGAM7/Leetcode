class Solution {
    public long countStableSubarrays(int[] capacity) {
        int n = capacity.length;
        HashMap<Integer, HashMap<Long, Long>> hm = new HashMap<>();  
        HashMap<Integer, long[]> last_occur = new HashMap<>();
        long pre = 0, ans = 0;

        HashMap<Long, Long> innerMap = new HashMap<>();
        innerMap.put(0L, 1L);
        hm.put(capacity[0], innerMap);
        last_occur.put(capacity[0],new long[]{0,0});
        for (int i = 1; i < n; i++) {
            int val = capacity[i];
            pre += val;
            long need = pre - (2L * val);

            if (hm.containsKey(val)) {
                HashMap<Long, Long> currentMap = hm.get(val);
                if (currentMap.containsKey(need)) {
                    long stable = currentMap.get(need);
                    ans += stable;
                    long last[] = last_occur.get(val);
                    if(last[0]+1 == i && last[1]==need){
                        ans--;
                    }
                }
            }

            HashMap<Long, Long> in = hm.getOrDefault(val, new HashMap<>());
            in.put(pre, in.getOrDefault(pre, 0L) + 1);
            hm.put(val, in);
            last_occur.put(val,new long[]{i,pre});
            // System.out.println(i+" "+ans);
        }

        return ans;
    }
}
