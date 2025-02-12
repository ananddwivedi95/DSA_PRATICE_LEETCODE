class Solution {
    public boolean rotateString(String s1, String s2) {
        //using lmp algorithm
    //     if(s1.length()!=s2.length())
    //     {
    //         return false;
    //     }
    //     int lps[]= new int[s2.length()]; //lps array
    //     findLps(lps,s1); //compute lps
    //     return areRotationUsingKmp(s2+s2,s1,lps); //using kmp algorithm
        
    // }
    // static boolean areRotationUsingKmp(String text,String pat,int[] lps)
    // {
    //     int n=text.length(); //length of text
    //     int m=pat.length(); //length of pattern
    //     int i=0; //track text character
    //     int j=0; //track pattern character
    //     while(i<text.length())
    //     {
    //         if(text.charAt(i)==pat.charAt(j))
    //         {
    //             i++;
    //             j++;
    //             if(j==m)
    //             {
    //                 return true;
    //             }
    //         }
    //         else
    //         {
    //             if(j==0)
    //             {
    //                 i++;
    //             }
    //             else
    //             {
    //                 j=lps[j-1];
    //             }
    //         }
    //     }
        
    //     return false;
    // }
    
    // static void findLps(int []lps,String s1)
    // {
    //     int p=0; //prefix
    //     int s=1; //suffix
    //     while(s<s1.length())
    //     {
    //         if(s1.charAt(p)==s1.charAt(s)) //character match
    //         {
    //             lps[s]=p+1;
    //             s++;
    //             p++;
    //         }
    //         else //character not match
    //         {
    //             if(p==0) // if p==0
    //             {
    //                 lps[s]=0;
    //                 s++;
    //             }
    //             else
    //             {
    //                 p=lps[p-1]; //if p!=0 then p=lps[p-1]
    //             }
    //         }
    //     }
    // naive approch
    if(s1.length()!=s2.length())
    {
        return false;
    }
    String string=s1+s1;
    return string.contains(s2);
    }
}