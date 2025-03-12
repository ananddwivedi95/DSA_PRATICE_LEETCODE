class Solution {
    public int maximumCount(int[] arr) {
        int negativeCount=0;
       int positiveCount=0;
       int i=0;
       int j=arr.length-1;
       while(i<=j)
       {
           if(arr[i]<0)
           {
               negativeCount++;
               i++;
           }
           else if(arr[i]==0)
           {
               i++;
           }
           else if(arr[j]==0)
           {
               j--;
           }
           else if(arr[j]>0)
           {
               positiveCount++;
               j--;
           }
       }

        return (negativeCount>=positiveCount) ? negativeCount : positiveCount;
    }
}