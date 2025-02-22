class Solution {
    Set<Integer>set=new HashSet<>();
    public boolean canReach(int[] arr, int start) {
        if(start<0 || start>=arr.length)return false;
        if(arr[start]==0)return true;
        if(!set.add(start))return false;
        boolean left=canReach(arr,start-arr[start]);
        boolean right=canReach(arr,start+arr[start]);
        return left||right;
    }
}