class Solution {
    public int maxAscendingSum(int[] arr) {
        int i=0;
        int j=0;
        int sum=arr[j];
        int max=Integer.MIN_VALUE;
        boolean flag= true;
        while(j<arr.length-1)
        {
            if(arr[j]<arr[j+1])
            { 
                sum+=arr[j+1];
            }
            else
            {
                max=Math.max(max,sum);
                sum=arr[j+1];
            }
            j++;
        }
        
        return Math.max(max,sum);
    }
}