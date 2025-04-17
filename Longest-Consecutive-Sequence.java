class Solution {
    public int longestConsecutive(int[] arr) {
        if(arr.length==0)
        {
            return 0;
        }
        Arrays.sort(arr);
        int count=1;
        int result=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==arr[i-1])
            {
                continue;
            }
            else if(arr[i]==arr[i-1]+1)
            {
                count++;
            }
            else
            {
                result=Math.max(count,result);
                count=1;
            }
        
        }

        result =Math.max(result,count);
        return result;
    }
}