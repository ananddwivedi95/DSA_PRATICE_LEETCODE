class Solution {
    public int[] pivotArray(int[] arr, int pivot) {
        int ii=0;
        int lessCount=0;
        int equalCount=0;
        while(ii<arr.length)
        {
            if(arr[ii]<pivot)
            {
                lessCount++;

            }
            if(arr[ii]==pivot)
            {
                equalCount++;

            }
            ii++;
        }
        ii=0;
        int [] result=new int[arr.length];
        int i=0;
        int j=lessCount;
        int k=lessCount+equalCount;
        while(ii<arr.length)
        {
            if(arr[ii]<pivot)
            {
                result[i]=arr[ii];
                i++;
                ii++;
            }
            else if(arr[ii]==pivot)
            {
                result[j]=arr[ii];
                j++;
                ii++;
            }
            else if(arr[ii]>pivot)
            {
                result[k]=arr[ii];
                k++;
                ii++;
            }
        }
        return result;
    }
}