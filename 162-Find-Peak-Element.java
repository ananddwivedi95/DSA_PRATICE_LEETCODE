class Solution {
    public int findPeakElement(int[] arr) {
        int peak=0;
       if(arr.length==0)
       {
        return -1;
       }
       if(arr.length==1)
       {
        return arr.length-1;
       }
       if(arr[arr.length-2]<arr[arr.length-1])
       {
        return arr.length-1;
       }
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
              peak=i+1;
            }
            else
            {
                break;
            }
        }
       return peak; 
    }
}