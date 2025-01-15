class Solution {
    public void nextPermutation(int[] arr) {
     boolean flag=true;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(i>0&&arr[i-1]<arr[i])
            {
                int greater=nextGreater(arr,i-1);
                swap(arr,i-1,greater);
                reverse(arr,i,arr.length-1);
                flag=false;
                break;
            }
        }
        if(flag==true)
        {
            reverse(arr,0,arr.length-1);
        }
    }

    static int nextGreater(int arr[],int greater)
    {
        int nextGreaterElement=greater+1;
        for(int i=greater+1;i<arr.length;i++)
        {
            if(arr[i]>arr[greater]&&arr[i]<=arr[nextGreaterElement])
            {
                nextGreaterElement=i;
            }
        }
        return nextGreaterElement;
    }
    static void swap(int arr[],int start,int end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    static void reverse(int arr[],int start,int end)
    {
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}