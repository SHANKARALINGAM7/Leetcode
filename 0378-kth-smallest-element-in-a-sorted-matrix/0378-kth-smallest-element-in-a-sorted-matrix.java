class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer>pq = new PriorityQueue<>((a,b)->b-a);
        int n=matrix.length,m=matrix[0].length;
        for(int i=0;i<n;i++){
              for(int j=0;j<m;j++){
                  if(pq.size()==k && pq.peek()<=matrix[i][j])continue;
                  pq.add(matrix[i][j]);
                  if(pq.size()>k)pq.poll();
              }
        }
        return pq.poll();
    
    }
}