class Solution {
    public int findMin(int[] arr) {
        int left=0;
        int right=arr.length-1;
        while(left<right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]>=arr[right])
            {
                left=mid+1;
            }
            else if(arr[mid]<arr[right])
            {
                right=mid;
            }
        }
        return arr[right];
    }
}