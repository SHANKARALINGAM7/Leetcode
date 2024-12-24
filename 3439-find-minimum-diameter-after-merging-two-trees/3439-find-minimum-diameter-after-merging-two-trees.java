
class Solution {
    int t1Max = 0, t2Max = 0;

    public int minimumDiameterAfterMerge(int[][] edges1, int[][] edges2) {
        int max1 = findMax(edges1, 0);
        int max2 = findMax(edges2, 0);

        
        List<Integer>[] adj1 = (List<Integer>[]) new ArrayList[max1 + 1];
        List<Integer>[] adj2 = (List<Integer>[]) new ArrayList[max2 + 1];
        for (int i = 0; i <= max1; i++) adj1[i] = new ArrayList<>();
        for (int i = 0; i <= max2; i++) adj2[i] = new ArrayList<>();

        addElement(adj1, edges1);
        addElement(adj2, edges2);

        findDiameter(adj1, 0, -1, 1);
        findDiameter(adj2, 0, -1, 2);

       
        int maxTree = Math.max(t1Max, t2Max);
        return Math.max(1 + (t1Max + 1) / 2 + (t2Max + 1) / 2, maxTree);
    }

    public int findDiameter(List<Integer>[] adj, int node, int parent, int flag) {
        int max1 = 0, max2 = 0;

        for (int neighbor : adj[node]) {
            if (neighbor == parent) continue; 

            int temp = 1 + findDiameter(adj, neighbor, node, flag);

            if (temp > max1) {
                max2 = max1;
                max1 = temp;
            } else if (temp > max2) {
                max2 = temp;
            }
        }

        
        if (flag == 1) t1Max = Math.max(t1Max, max1 + max2);
        else t2Max = Math.max(t2Max, max1 + max2);

        return max1;
    }

    public int findMax(int[][] arr, int max) {
        for (int[] a : arr) {
            max = Math.max(max, Math.max(a[0], a[1]));
        }
        return max;
    }

    public void addElement(List<Integer>[] adj, int[][] arr) {
        for (int[] a : arr) {
            adj[a[0]].add(a[1]);
            adj[a[1]].add(a[0]);
        }
    }
}
