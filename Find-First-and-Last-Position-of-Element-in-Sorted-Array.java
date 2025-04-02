class Solution {
    public int[] searchRange(int[] arr, int target) {
      \tint lb=lowerBound(arr,target);
        int ub=upperBound(arr,target);
        int [] result={-1,-1};
       if (lb == arr.length || arr[lb] != target) {   
           return result;
    }
        result[0]=lb;
        result[1]=ub-1;
        return result;
    }
    static int lowerBound(int[] arr, int target)
    {
        int left=0;
        int right=arr.length-1;
        int result=arr.length;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]>=target)
            {
              result=Math.min(result,mid);
              right=mid-1;
            }
            else if(arr[mid]<target)
            {
               left=mid+1;
            }
        }
        return result;
    }
    static int upperBound(int[] arr, int target)
    {
        int left=0;
        int right=arr.length-1;
        int result=arr.length;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]>target)
            {
              result=Math.min(result,mid);
              right=mid-1;
            }
            else if(arr[mid]<=target)
            {
               left=mid+1;
            }
        }
        return result;
    }
}