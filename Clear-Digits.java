class Solution {
    public String clearDigits(String s) {
        StringBuilder str= new StringBuilder();
        
        for(char ch:s.toCharArray())
        {
           if(findDigit(ch))
           {
               if(!str.isEmpty())
               {
                  str.deleteCharAt(str.length()-1);
               }
           }
           else
           {
            str.append(ch);
           }
        }
        return str.toString();
    }
    static boolean findDigit(char ch)  // either using this method u can directly use Character.isDigit(char) method 
                                      //is for check character is digit  or not 
    {
        if(ch=='0'||ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9')
        {
            return true;
        }
        return false;
    }
}