class Solution {
    public int[] getAverages(int[] arr, int k) {
        
        int []result=new int[arr.length];
        Arrays.fill(result,-1);
        if(k==0)
        {
            return arr;
        }
        if(arr.length<k*2+1)
        {
           return result;
        }
        int left=0;
        int right=k*2;
        long windowSum=0;
        //calculating 1st 2*k window sum
        for(int i=left;i<=right;i++)
        {
            windowSum=windowSum+arr[i];
        }
        int i=k;
        int avg=2*k+1;
        result[i]=(int)(windowSum/avg);
        i++;
        right++;
        while(right<arr.length)
        {
           windowSum=windowSum-arr[left]+arr[right];
           result[i]=(int)(windowSum/avg);
           i++;
           right++;
           left++;
        }
        return result;
    }
}