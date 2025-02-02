class Solution {
    public int[] sortArray(int[] arr) {
      margeSort(arr,0,arr.length-1);
      return arr;  
    }
    static void margeSort(int arr[],int start,int end)
    {
        int mid=start+(end-start)/2;
        if(start>=end)
        {
            return;
        }
        margeSort(arr,start,mid); //left
        margeSort(arr,mid+1,end); //right
        marge(arr,start,mid,end);
    }
    static void marge(int []arr,int start,int mid,int end)
    {
        int size=(end-start)+1;
        int newArr[]=new int[size];
        int left=start;
        int right=mid+1;
        int index=0;
        
        while(left<=mid&&right<=end)
        {
            if(arr[left]<=arr[right])
            {
                newArr[index++]=arr[left++];
            }
            else
            {
                newArr[index++]=arr[right++];
            }
        }
        while(left<=mid)
        {
            newArr[index++]=arr[left++];
        }
        while(right<=end)
        {
            newArr[index++]=arr[right++];
        }
         for (int i = 0; i < size; i++) {
            arr[start + i] = newArr[i]; 
        }
    }

}