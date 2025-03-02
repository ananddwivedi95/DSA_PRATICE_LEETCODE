class Solution {
    public int[] applyOperations(int[] arr) {
       int i=0;
        while(i<arr.length-1) {
            if (arr[i] == arr[i + 1]) {
                arr[i] = arr[i] * 2;
                arr[i + 1] = 0;
                i++;
            } else {
                i++;
            }
        }
        int ii=0;
        int jj=0;
        while(ii<arr.length)
        {
            if(arr[ii]!=0)
            {
                swap(ii,jj,arr);
                jj++;
            }
            ii++;
        }
        return arr;
        
    } 
    static void swap(int i,int j ,int[] arr)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    } 
}