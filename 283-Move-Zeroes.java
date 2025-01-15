class Solution {
    public void moveZeroes(int[] arr) {
       int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
            swap(arr,count,i);
            count++;
            }
        }
    }
    
static void swap(int arr[],int count,int i)
    {
        int temp=arr[count];
        arr[count]=arr[i];
        arr[i]=temp;
    }
}