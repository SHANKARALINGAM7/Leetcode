class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]>ans=new ArrayList<>();
        int n=nums1.length,m=nums2.length;
        int id[]=new int[1001];
        for(int a[]:nums1)id[a[0]]+=a[1];
        for(int a[]:nums2)id[a[0]]+=a[1];
        for(int i=0;i<1001;i++){
            if(id[i]!=0){
                ans.add(new int[]{i,id[i]});
            }
        }
        int arr[][]=new int[ans.size()][2];
        int i=0;
        for(int a[]:ans)arr[i++]=a;
        return arr;

    }
}