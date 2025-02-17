class Solution {
    public int maxArea(int[] arr) {
      int i=0;
        int j=arr.length-1;
        int result=0;
        while(i<j)
        {
            if(arr[i]<arr[j])
            {
                int sum=arr[i]*(j-i);
                result=Math.max(result,sum);
                i++;
            }
            else
            {
                int sum=arr[j]*(j-i);
                result=Math.max(result,sum);
                j--;
            }
        }
        return result;  
    }
}