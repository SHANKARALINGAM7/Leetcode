class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]+nums[1]<=nums[2])return "none";
        Set<Integer> s = new HashSet<>();
        s.add(nums[0]);
        s.add(nums[1]);
        s.add(nums[2]);
        int size = s.size();
        if(size ==1){
              return "equilateral";
          }
        else if(size ==2){
              return "isosceles";
        }
         return"scalene";
        

    }
}