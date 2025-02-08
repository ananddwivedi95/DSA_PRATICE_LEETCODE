class Solution {
    public String addBinary(String string1, String string2) {
      int i=string1.length()-1;
      int j=string2.length()-1;
      int carry=0;
      int total=0;
      StringBuilder sb= new StringBuilder();
      while(i>=0||j>=0)
      {
        int a=0;
        int b=0;

        if(i>=0)
        {
          a=string1.charAt(i)-'0';
        }
        else
        {
            a=0;
        }

        if(j>=0)
        {
           b=string2.charAt(j)-'0';
        }
        else
        {
             b=0;
        }
       total=a+b+carry;

       if(total==0)
       {
        carry=0;
        sb.append(\0\);
       }
       else if(total==1)
       {
        carry=0;
        sb.append(\1\);
       }
       else if(total==2)
       {
           carry=1;
           sb.append(\0\);
       }
       else
       {
            carry=1;
            sb.append(\1\);
       }
       i--;
       j--;
      }  
      if(carry==1)
      {
        sb.append(\1\);
      }
      while(sb.length() > 1 && sb.charAt(sb.length()-1) == '0') {
    sb.setLength(sb.length()-1);

}
      return sb.reverse().toString();
    }
}