class Solution {
    public void sortColors(int[] arr) {
      int i=0;  //for 0
        int j=0;  //for 1
        int k=arr.length-1; // for 2
        while(j<=k)
        {
            if(arr[j]==0)
            {
                swap(i ,j,arr);
                i++;
                j++;
            }
            else if(arr[j]==1)
            {
                j++;
            }
            else if(arr[j]==2)
            {
                swap(k,j,arr);
                k--;
            }
        }
    }
    static void swap(int i,int j,int[] arr)
{
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}
}