import java.util.*;

class Solution {
    public class Pair {
        int node;
        long weight;

        public Pair(int node, long weight) {
            this.node = node;
            this.weight = weight;
        }
    }

    public int countPaths(int n, int[][] roads) {
        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());

        for (int[] node : roads) {
            int u = node[0], v = node[1];
            long wt = node[2];
            adj.get(u).add(new Pair(v, wt));
            adj.get(v).add(new Pair(u, wt));
        }

        int mod = (int) (1e9 + 7);
        long[] dis = new long[n];
        Arrays.fill(dis, Long.MAX_VALUE);
        int[] ways = new int[n]; 
        ways[0] = 1; 

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Long.compare(a.weight, b.weight));
        pq.add(new Pair(0, 0));
        dis[0] = 0;

        while (!pq.isEmpty()) {
            Pair now = pq.poll();
            int cur = now.node;
            long curDist = now.weight;

            if (curDist > dis[cur]) continue;

            for (Pair p : adj.get(cur)) {
                int nxt = p.node;
                long newDist = curDist + p.weight;

                if (newDist < dis[nxt]) {
                    dis[nxt] = newDist;
                    ways[nxt] = ways[cur]; 
                    pq.add(new Pair(nxt, newDist));
                } else if (newDist == dis[nxt]) {
                    ways[nxt] = (ways[nxt] + ways[cur]) % mod; 
                }
            }
        }

        return ways[n - 1]; 
    }
}


