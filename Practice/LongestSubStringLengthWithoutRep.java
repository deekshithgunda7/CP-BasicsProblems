// Given a string s, find the length of the longest 
// substring
//  without repeating characters.

//  Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.

class Solution{
    public int longestSubStringWithOutRep(String s){
        HashMap<Character,Integer> mpp new HashMap<>();
        int l=0;
        int r=0;
        int maxLen=0;
        while(r<s.length()){
            if(mpp.containsKey(s.charAt(r))){
                l=Math.max(l,mpp.get(s.charAt(r))+1);
            }
            mpp.put(s.chatAt(r),r);
            max=Math.max(maxLen,r-l+1);
            r++;
        }
        return maxLen;
    }
}