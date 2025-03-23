class Solution {
    public int longestOnes(int[] arr, int k) {
       int i=0;
       int countZero=0;
       int maxCount=0;
       for(int j=0;j<arr.length;j++)
       {
           if(arr[j]==0)
           {
            countZero++;
           }
           while(countZero>k)
           {
            if(arr[i]==0)
            {
                countZero--;
            }
            i++;
           }
           maxCount=Math.max(maxCount,j-i+1);
       }
       return maxCount;
    }
}