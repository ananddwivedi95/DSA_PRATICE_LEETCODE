class Solution {
    public int hIndex(int[] citations) {
        if(citations.length==0||citations==null)
        {
            return 0;
        }
        countSort(citations);
        int max=1;
        for(int i=0;i<citations.length;i++)
        {
           if(citations[i]>=max)
           {
               max++;
           }
           else
           {
               break;
           }
        }
        return max-1;
        
    }
    static void countSort(int[] arr)
    {
        int max=Integer.MIN_VALUE;
        for(int i:arr)
        {
            if(i>max)
            {
                max=i;
            }
        }
        int countArr[]= new int[max+1];
        for(int i:arr)
        {
            countArr[i]++;
        }
        int index=arr.length-1;
        for(int i=0;i<=max;i++)
        {
            while(countArr[i]>0)
            {
                arr[index]=i;
                index--;
                countArr[i]--;
            }
        }
    }
}