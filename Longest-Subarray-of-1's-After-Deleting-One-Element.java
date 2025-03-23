class Solution {
    // public int longestSubarray(int[] arr) {
    //    int count=0;
    //    int maxCount=0;
    //    for(int i=0;i<arr.length;i++)
    //    {

    //     if(arr[i]==0)
    //     {
    //         count++;
    //         maxCount=Math.max(maxCount,findMax(arr,i));
    //     }
    //    } 
    //    if(count==0)
    //    {
    //     return arr.length-1;
    //    }
    //    return maxCount;
    // }
    // static int findMax(int[] arr,int deletElement)
    // {
    //     int countOne=0;
    //     int maxOneCount=0;
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         if(i==deletElement)
    //         {
    //            continue;
    //         }
    //         else if(arr[i]==1)
    //         {
    //             countOne++;
    //             maxOneCount=Math.max(maxOneCount,countOne);
    //         }
    //         else if(arr[i]==0)
    //         {
    //             countOne=0;
    //         }

    //     }
    //     return maxOneCount;
    // }

    public int longestSubarray(int[] arr)
    {
        int countOne=0;
        int maxCount=0;
        int i=0;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]==0)
            {
              countOne++;
            }

            while(countOne>1)
            {
                if(arr[i]==0)
                {
                    countOne--;
                }
                i++;
            }
        maxCount=Math.max(maxCount,j-i);
        }
        return maxCount;   
    }
}