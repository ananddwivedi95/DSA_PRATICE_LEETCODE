class Solution {
    public int[] twoSum(int[] arr, int target) {
        int left=0;
        int right=arr.length-1;
        int []result= new int[2];
        while(left<right)
        {
            int sum=arr[left]+arr[right];
            if(sum==target)
            {
                result[0] = left + 1;
                result[1] = right + 1;
                break;

            }
            else if(sum>target)
            {
                right--;
            }
            else if(sum<target)
            {
                left++;
            }
        }
        return result;
    }
}