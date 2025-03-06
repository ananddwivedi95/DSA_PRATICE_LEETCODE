class Solution {
    public List<Integer> findAnagrams(String text, String pat) {
       //frequency array of pattern
       int []freq = new int[26];
       for(char ch:pat.toCharArray())
       {
          freq[ch-'a']++;
       }
       //logic for calculating anagram
       int i=0;
       int j=0;
       int n=text.length();
       int k=pat.length();
       ArrayList<Integer> result=new ArrayList<>();
       while(j<n)
       {
        int freqid=text.charAt(j)-'a';
        freq[freqid]--;
        if(j-i+1==k)
        {
            if(forAllZero(freq))
            {
               result.add(i);
            }
            freq[text.charAt(i)-'a']++;
            i++;
        }
        j++;
       }
       return result;
    }
    static boolean forAllZero(int[] freq)
    {
        for(int i:freq)
        {
            if(i!=0)
            {
                return false;
            }
        }
        return true;
    }
}