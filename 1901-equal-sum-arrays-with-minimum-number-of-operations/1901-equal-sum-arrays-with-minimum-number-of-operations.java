class Solution {
     
    public int helper(int a[] , int b[] , int s1, int s2){
        int i = 1 , j = 6;
        int count = 0;
        while(s1>s2 && i<6 && j>=0){
            if(a[j]>0){
                  int balance = (j)*(a[j]) - a[j];
                  int need = s1 - s2;
                  if( balance >= need){
                       count += need/(j-1);
                       if(need % (j-1) != 0) count++;
                       s1 -= balance;
                  }
                  else {
                       s1 -= balance;
                       count += a[j];
                  }
                //   System.out.println(balance + " "+need);
            }
            if(s1>s2 && b[i]>0){
                int balance = (6*b[i])-((i)*b[i]);
                int need = s1 - s2;
                if(balance>= need){
                       count += need/(6-i);
                       if(need % (6-i) != 0) count++;
                       s2 += balance;
                }
                else {
                    s2 += balance;
                    count += b[i];
                }
            }
            // System.out.println(s1 + " "+ s2 + " "+ i +" "+ j);
            i++;
            j--;
        }

        return count;

    }

    public int minOperations(int[] nums1, int[] nums2) {
        int n = nums1.length , m =nums2.length;

        if(Math.min(m,n)*6<Math.max(m,n)) {
              return -1;
        }

        int sum1 = 0 ,sum2 = 0;
        int freq1[] = new int[7];
        int freq2[] = new int[7];
        for(int i : nums1){
             sum1 += i;
             freq1[i]++;
        }
        for(int i : nums2){
             sum2 += i;
             freq2[i]++;
        }
        // System.out.println(Arrays.toString(freq1));
        int ans = -1;
        if(sum1==sum2)return 0;
        else if(sum1>sum2) {
             ans = helper(freq1,freq2,sum1,sum2);
        }
        else ans = helper(freq2,freq1,sum2,sum1);

        return ans;
    }
}