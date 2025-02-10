class Solution {
    public String longestPrefix(String string) {
        int lps[]= new int[string.length()];
        int p=0;
        int s=1;
        while(s<string.length())
        {
            //match
            if(string.charAt(p)==string.charAt(s))
            {
                lps[s]=p+1;
                p++;
                s++;
            }
            else  //notmatch
            {
                if(p==0)
                {
                    lps[s]=0;
                    s++;
                }
                else
                {
                    p=lps[p-1];
                }
            } 
        }
        return string.substring(0, lps[string.length() - 1]);
    }
}