class Solution {
    public class Pair {
            int firstMax;
            int secondMax;
    
            public Pair(int firstMax, int secondMax) {
                this.firstMax = firstMax;
                this.secondMax = secondMax;
            }
        }

    public int maximumSum(int[] nums) {

        HashMap<Integer,Pair>hm=new HashMap<>();
        for(int n:nums){
            int sum=0;
            int num=n;
            while(n>0){
                sum+=n%10;
                n/=10;
            }
            if(!hm.containsKey(sum))hm.put(sum,new Pair(0,0));
            if(hm.get(sum).firstMax<=num){
                int temp=hm.get(sum).firstMax;
                hm.put(sum,new Pair(num,temp));
            }
            else if(hm.get(sum).secondMax<=num){
                int temp=hm.get(sum).firstMax;
                hm.put(sum,new Pair(temp,num));

            }
        }
        int max=-1;

        for(int i:hm.keySet()){
            int n1=hm.get(i).firstMax;
            int n2=hm.get(i).secondMax;
            if(n1!=0 && n2!=0) max=Math.max(max,n1+n2);
        }
        return max;
    }
}