class Solution {
    public class Pair {
            char c;
            int ind;
    
            public Pair(char c, int ind) {
                this.c = c;
                this.ind = ind;
            }
        }

    public String clearStars(String s) {
       
        StringBuffer res = new StringBuffer();
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            if (a.c == b.c) {
                  return Integer.compare(b.ind, a.ind);
                  }
           return Character.compare(a.c, b.c); 
        });
        
        int i = 0, n =s.length();
        char ans[] = new char[n];
        for(char c : s.toCharArray()){
            if(c=='*'){
                 Pair p = pq.poll();
                 ans[p.ind] = '*';
            }
            else{
                 pq.add(new Pair(c,i));
            }
            ans[i]=c;
            i++;
        }

        for(int j=0;j<n;j++){
              if(ans[j] != '*')res.append(ans[j]);
        }
        
        return res.toString();
    }
}