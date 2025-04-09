class Solution {
    public int findKthPositive(int[] arr, int k) {
    //    int count=1;
    //    int i=0;
    //    int missing=0;
    //    while(missing<k)
    //    {
    //       if(i<arr.length&&arr[i]==count)
    //       {
    //         i++;
    //       }
    //       else
    //       {
    //          missing++;
    //       }
    //       if(missing==k)
    //       {
    //         return count;
    //       }
    //       count++;
    //    }
    //     return -1;
    int left=0;
    int right=arr.length-1;
    while(left<=right)
    {
        int mid=left+(right-left)/2;
        int missCount=arr[mid]-(mid+1);
        if(missCount<k)
        {
            left=mid+1;
        }
        else
        {
           right=mid-1;
        }
    }
    return left+k;
    }
}