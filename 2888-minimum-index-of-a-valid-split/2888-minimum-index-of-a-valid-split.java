class Solution {
    public int minimumIndex(List<Integer> nums) {
        int n=nums.size();
        int pre[]=new int[n];
        int suf[]=new int[n];
        findSuf(suf,n,nums);

        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums.get(i),hm.getOrDefault(nums.get(i),0)+1);
            pre[i]=hm.get(nums.get(i));
            if((i+1<2*pre[i] && (n-i-1)<2*(suf[i]-1)) || (i+1<2*(pre[i]-1) &&(n-i-1)<2*suf[i])){
                 return i;
            }
        }
        return -1;
        
    }

    public void findSuf(int a[],int n,List<Integer>l){
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=n-1;i>=0;i--){
            hm.put(l.get(i),hm.getOrDefault(l.get(i),0)+1);
            a[i]=hm.get(l.get(i));
        }
    }
}