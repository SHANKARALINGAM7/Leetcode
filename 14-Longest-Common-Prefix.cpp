class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string ms=strs[0],ls=strs[0];
       for(int i=0;i<strs.size();i++){
        if(ms>strs[i]){
            ms=strs[i];
        }
        if(ls<strs[i]){
            ls=strs[i];
        }

       }
       int i=0;
       while(i<ms.size() && i<ls.size() && ms[i]==ls[i] ){
        i++;
       }
       return ms.substr(0,i);

    }
};