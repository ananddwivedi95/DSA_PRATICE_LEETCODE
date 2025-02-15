class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int result=0;
        int sum=0;
        int i=0; //left
        int j=nums.length-1; //right
        while(i<j)
        {
            sum=nums[i]+nums[j];
            result=Math.max(result,sum);
            i++;
            j--;
        }
        return result;
    }
}