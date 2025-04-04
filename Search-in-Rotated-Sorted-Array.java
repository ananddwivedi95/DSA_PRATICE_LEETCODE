class Solution {
    public int search(int[] arr, int target) {
        if(arr[0]<arr[arr.length-1])
        {
            return binarySearch(arr,0,arr.length-1,target);
        }
     int pivot=findPivot(arr);
     if(target>arr[arr.length-1])
     {
       return binarySearch(arr,0,pivot-1,target);
     }   
     return binarySearch(arr,pivot,arr.length-1,target);
    }
    static int binarySearch(int[] arr,int start,int end,int target)
    {
        int left=start;
        int right=end;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]==target)
            {
                return mid;
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
        return -1;
    }
    static int findPivot(int[] arr)
    {
        int left=0;
        int right=arr.length-1;
        while(left<right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]<arr[right])
            {
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