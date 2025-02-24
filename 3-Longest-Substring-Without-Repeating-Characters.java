class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
        {
            return 0;
        }
        HashSet<Character> hs= new HashSet<>();
        int right=0;
        int left=0;
        int maxLength=1;
        for(right=0;right<s.length();right++)
        {
            while(hs.contains(s.charAt(right)))
            {
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(s.charAt(right));
          maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
}