class Solution {
    public boolean isSubsequence(String st1, String st2) {
       int i=0;
       int j=0;
       while(j<st2.length())
       {
        if(i==st1.length())
        {
            return true;
        }
            if(st1.charAt(i)==st2.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                j++;
            }
       }
       if(i==st1.length())
       {
        return true;
       }
       return false;
    }
}