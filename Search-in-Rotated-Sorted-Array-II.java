class Solution {
    public boolean search(int[] arr, int target) {
      int pivot=findPivot(arr);
      if(binarySearch(arr,0,pivot-1,target))
      {
        return true;
      }
      return binarySearch(arr,pivot,arr.length-1,target);
    }
    static boolean binarySearch(int[] arr,int start,int stop,int target)
    {
        int left=start;
        int right=stop;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]==target)
            {
                return true;
            }
            else if(arr[mid]>target)
            {
                right=mid-1;
            }
            else if(arr[mid]<target)
            {
                left=mid+1;
            }
        }
        return false;
    }
    static int findPivot(int[] arr)
    {
        int left=0;
        int right=arr.length-1;
        while(left<right)
        {
            
             //skip the duplicate value from the left side
            while(left<right && arr[left]==arr[left+1])
            {
                left++;
            }
            // skip the duplicate value from the right side
            while(left<right && arr[right]==arr[right-1])
            {
                right--;
            }
            int mid=left+(right-left)/2;
            if(arr[mid]>arr[right])
            {
                left=mid+1;
            }
            else
            {
                right=mid;
            }
        }
        return right;
    }
}