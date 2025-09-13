class Solution {
    public int smallestAbsent(int[] nums) {
        int arr[] = new int[300];
        int sum = 0 , n = nums.length;
        for(int i:nums){
            arr[i+100]++;
            sum += i;
        }
        int avg = (int)(sum/n) + 100;
        avg += 1;
        // System.out.println(avg);
        if(avg<=100){
            int i=101;
            while(arr[i]!=0){
                i++;
            }
            return i-100;
        }
        while(arr[avg] != 0){
            avg++; 
        }
        return avg-100;
    }
}