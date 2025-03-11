class Solution {
    public int numberOfSubstrings(String s) {
        int i=0;
        int j=0;
        int n= s.length();
        int result=0;
        int[] freq= new int[3];
        while(j<s.length())
        {
            freq[s.charAt(j)-'a']++;
            while(allNonZero(freq))
            {
                result=result+(n-j);
                freq[s.charAt(i)-'a']--;
                i++;
            }
            j++;
        }
        return result;
    }
    static boolean allNonZero(int[] freq)
    {
        for(int i:freq)
        {
            if(i<=0)
            {
                return false;
            }
        }
        return true;
    }
}