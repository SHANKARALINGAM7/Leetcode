class Solution {
    public long maximumPoints(int[] enemyEnergies, int currentEnergy) {
        int min=Integer.MAX_VALUE;
        long sum=currentEnergy;
        for(int i:enemyEnergies){
              min=Math.min(min,i);
              sum+=i;
        }
         if(currentEnergy<min)return 0;
       return (sum-min)/min;

    }
}