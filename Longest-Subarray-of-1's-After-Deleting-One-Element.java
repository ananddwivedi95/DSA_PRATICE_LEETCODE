class Solution {
    // public int longestSubarray(int[] arr) {
    //     int n=arr.length;
    //      int delt=0;
    //      int maxCount=0;
    //      int count=0;
    //      for(int i=0;i<arr.length;i++)
    //      {
    //         if(arr[i]==0)
    //         {
    //             count++;
    //             maxCount=Math.max(maxCount,findMax(arr,i));
    //         }
    //      }
    //      if(count==0)
    //      {
    //         return arr.length-1;
    //      }
    //      return maxCount;
    // }
    // static int findMax(int []arr,int delElement)
    // {
    //     int oneCount=0;
    //     int maxSubArray=0;
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         if(i==delElement)
    //         {
    //             continue;
    //         }
    //         else if(arr[i]==1)
    //         {
    //             oneCount++;
    //             maxSubArray=Math.max(maxSubArray,oneCount);
    //         }
    //         else if(arr[i]==0)
    //         {
    //             oneCount=0;
    //         }
    //     }
    //     return maxSubArray;
    // }
    public int longestSubarray(int[] arr)
    {      int i=0;
           int j=0;
           int countZero=0;
           int maxSubArray=0;
           while(j<arr.length)
           {
            if(arr[j]==0)
            {
              countZero++;
            }
            while(countZero>1)
            {
                if(arr[i]==0)
                {
                    countZero--;
                }
                i++;
            }
            maxSubArray=Math.max(maxSubArray,j-i);
            j++;
           }
        return maxSubArray;
    }
}