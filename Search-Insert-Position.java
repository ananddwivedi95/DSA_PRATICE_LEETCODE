class Solution {
    public int searchInsert(int[] arr, int target) {
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        int result=arr.length;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(target<=arr[mid])
            {
               result=Math.min(result,mid);
               right=mid-1;
            }
            else if(target>arr[mid])
            {
                left=mid+1;
            }
        }
        return result;
    }
}