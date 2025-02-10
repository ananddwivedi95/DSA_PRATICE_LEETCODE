class Solution {
    public boolean rotateString(String s1, String s2) {
         // Your code here
        // StringBuilder sb= new StringBuilder(s2);
        
        
        // //check right rotation
        // int i=0;
        // while(i<sb.length())
        // {
        //     char ch=sb.charAt(0);
        //     sb.deleteCharAt(0);
        //     sb.append(ch);
        //     if(s1.equals(sb.toString()))
        //     {
        //         return true;
        //     }
        //     i++;
        // }
        // //check left rotation
        // int j=sb.length()-1;
        // while(j>=0)
        // {
        //  char ch=sb.charAt(sb.length()-1);
        //  sb.deleteCharAt(sb.length()-1);
        //  sb.insert(0,ch);
        //  if(s1.equals(sb.toString()))
        //  {
        //      return true;
        //  }
        //  j--;
        // }
        // return false;
        if(s1.length()!=s2.length())
        {
            return false;
        }
        s1=s1+s1;
        return s1.contains(s2);
    }
}