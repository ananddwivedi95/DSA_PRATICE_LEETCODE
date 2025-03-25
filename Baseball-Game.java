class Solution {
    public int calPoints(String[] str) {
       ArrayList<Integer> ar= new ArrayList<>();
        for(String c:str)
        {
            if(isDigit(c))
            {
                ar.add(Integer.parseInt(c));
            }
            else if(c.equals(\+\))
            {
                int a=ar.get(ar.size()-1);
                int b=ar.get(ar.size()-2);

                ar.add(a+b);
            }
            else if(c.equals(\D\))
            {
                int a=ar.get(ar.size()-1)*2;
                ar.add(a);
            }
            else if(c.equals(\C\))
            {
                 ar.remove(ar.size()-1);
            }
        }
        int result=0;
        for(int i: ar)
        {
            result+=i;
        }
        return result;
    }
    static boolean isDigit(String s)
    {
        try
        {   Integer.parseInt(s);
            return true;
        }
        catch(NumberFormatException e)
        {
            return false;
        }
    }

}