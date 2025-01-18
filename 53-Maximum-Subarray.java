class Solution {
    public int maxSubArray(int[] arr) {
      int sum=0;
        int sumMax=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            sumMax=Math.max(sum,sumMax);
            if(sum<0)
            {
                sum=0;
            }
        }
        return sumMax;
    }
}