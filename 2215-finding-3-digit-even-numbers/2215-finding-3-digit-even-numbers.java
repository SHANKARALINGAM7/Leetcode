class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int freq[] = new int[10];
        for(int i : digits) freq[i]++;
        List<Integer>l=new ArrayList<>();
        for(int i=100;i<1000;i++){
               int freq1[] = new int[10];
               int num = i ,flag=0;
               if(num%2==1)flag=1;
               while(num>0){
                   freq1[num%10]++;
                   num/=10;
               }
               for(int j=0;j<10;j++){
                    if(freq[j]<freq1[j])flag=1;
               }
               if(flag==0)l.add(i);

        }
        int ans[]= new int[l.size()];
        for(int i=0;i<l.size();i++){
            ans[i]=l.get(i);
        }
        return ans;
    }
}