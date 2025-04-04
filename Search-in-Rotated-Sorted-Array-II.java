class Solution {
    public boolean search(int[] arr, int target) {
      int pivot=findPivot(arr);
      if(target>arr[arr.length-1])
      {
        return binarySearch(arr,0,pivot-1,target);
      }
      return binarySearch(arr,pivot,arr.length-1,target);
    }
    static boolean binarySearch(int[] arr,int start,int end,int target)
    {
        int left=0;
        int right=arr.length-1;
      while(left<=right)
      {
        int mid=left+(right-left)/2;
        if(arr[mid]==target)
        {
            return true;
        }
        else if(arr[mid]<target)
        {
            left=mid+1;
        }
        else if(arr[mid]>target)
        {
            right=mid-1;
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
            while(left<right && arr[left]==arr[left+1]) //skip duplicate from left side
            {
                left++;
            }
            while(left<right && arr[right]==arr[right-1])  //skip duplicate from right side;
            {
                right--;
            }
            int mid=left+(right-left)/2;
            if(arr[mid]<arr[right]){
                right=mid;
            }
            else if(arr[mid]>arr[right])
            {
                left=mid+1;
            }
        }
        return left;
    }
}