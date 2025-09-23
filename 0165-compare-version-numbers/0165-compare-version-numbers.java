class Solution {
    public int compareVersion(String version1, String version2) {
         
         String num1[] = version1.split("[.]");
         String num2[] = version2.split("[.]");
         int i = 0, n = num1.length ,  m = num2.length;
         while(i<n && i<m){
            int n1 = Integer.parseInt(num1[i]);
            int n2 = Integer.parseInt(num2[i]);
            if(n1>n2){
                 return 1;
            }
            else if(n2>n1){
                 return -1;
            }
            i++;
         }
         System.out.println(i);
         if(i != n){
           while(i < n){
              int n1 = Integer.parseInt(num1[i]);
              if(n1 != 0) return 1;
              i++;
           }
         }
         else if(i != m){
            while(i < m){
              int n1 = Integer.parseInt(num2[i]);
              if(n1 != 0) return -1;
              i++;
            }
         }
         return 0;
    }
}