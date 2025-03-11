class Solution {
    public int maxVowels(String s, int k) {
       int i=0;
       int j=k;
       int count=0;
       //count 1st count sliding window
       for(int ii=0;ii<k;ii++)
       {
          if(isVowels(s.charAt(ii)))
          {
            count++;
          }
       }
       int maxVowel=count;
       while(j<s.length())
       {
        if(isVowels(s.charAt(j)))
        {
            count++;
        }
        if(isVowels(s.charAt(i)))
        {
            count--;
           
        }
        maxVowel=Math.max(maxVowel,count);
        i++;
        j++;
       }
       return maxVowel;
    }
    static boolean isVowels(char ch)
    {
        return "aeiou".indexOf(ch)  != -1;
    }
}