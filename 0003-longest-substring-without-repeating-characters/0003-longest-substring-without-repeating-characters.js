/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
          let str = s;
          const map = new Map();
          let max = 0, left = 0;
          let len = str.length;
          for(let i=0;i<len;i++){
              if(map.has(str[i])){
                max = Math.max(i-left,max);
                while(str[left] != str[i]){
                     map.delete(str[left]);
                     left++;
                }
                left++;
              }
            //   console.log(left+" "+max);
              map.set(str[i],i);
          }
        //   console.log(left);
          max = Math.max(len-left,max);
          return max;
};