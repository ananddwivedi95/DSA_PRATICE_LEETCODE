class Solution {
    public boolean search(int[] arr, int target) {
        Arrays.sort(arr);
        int max=maxElement(arr);
        boolean bool=false;
        if(arr[max]>=target)
        {
         bool= binarySearch(arr,target,0,max);
        }
         if(bool==true)
         {
           return bool;
         }
         return binarySearch(arr,target,max+1,arr.length-1);
         
    }
    static boolean binarySearch(int arr[],int target,int start,int end)
    {
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==target)
            {
                return true;
            }
            if(arr[mid]>target)
            {
                end=mid-1;
            }
            if(arr[mid]<target)
            {
                start=mid+1;
            }
        }
        return false;
    }
    static int maxElement(int arr[])
    {
       int peak=0;
        if(arr.length==0)
        {
            return -1;
        }
        if(arr.length==1)
        {
            return arr.length-1;
        }
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                peak=i+1;
            }
            else
            {
                break;
            }
        }
        return peak;
    }
}