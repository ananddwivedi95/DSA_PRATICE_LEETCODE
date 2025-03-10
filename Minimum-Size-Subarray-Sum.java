class Solution {
    public int minSubArrayLen(int k, int[] arr) {
    int i=0;
    int j=0;
    int sum=0;
    int minLength=Integer.MAX_VALUE;
    boolean flag=true;
    while(j<arr.length)
    {
        sum=sum+arr[j];
        j++;
        while(sum>=k)
        {
            flag=false;
            minLength=Math.min(minLength,j-i);
            sum=sum-arr[i];
            i++;
        }
    }
    if(flag==true)
    {
        return 0;
    }
    return minLength;
    }
}