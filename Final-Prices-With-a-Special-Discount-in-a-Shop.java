class Solution {
    public int[] finalPrices(int[] arr) {
        for(int i=0;i<arr.length-1;i++)
        {
            int j=i+1;
            while(j<arr.length)
            {
                if(arr[j]<=arr[i])
                {
                    arr[i]=arr[i]-arr[j];
                    break;
                }
                else
                {
                    j++;
                }
            }
        }
        return arr;
    }
}