class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int size=n/3;
        HashMap<Integer,Integer>map=new HashMap<>();
       
        List<Integer>list=new ArrayList<>();         for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:map.keySet()){
            if(map.get(num) > size){
                list.add(num);
            }
        }
        return list;
    }
}

