class Solution {
    public long countSubarrays(int[] arr, int mink, int maxk) {
        int minkPosition=-1;
        int maxkPosition=-1;
        int culprit=-1;
        int j=0;
      long ans=0;
        while(j<arr.length)
        {
            if(arr[j]<mink||arr[j]>maxk)
            {
                culprit=j;
            }
            if(arr[j]==mink)
            {
                minkPosition=j;
            }
            if(arr[j]==maxk)
            {
                maxkPosition=j;
            }
            long smaller=Math.min(minkPosition,maxkPosition);
            long temp=smaller-culprit;
  
            ans+=(temp<=0) ? 0:temp;         

            j++;
        }
        return ans;
    }
}