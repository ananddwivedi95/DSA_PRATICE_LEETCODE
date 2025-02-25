class Solution {
    public int trap(int[] arr) {
       
       // using 2 pointer approch
       int left=0; // for left track element
       int right=arr.length-1;  //for right track element
       int leftMax=0;
       int rightMax=0;
       int sum=0;
       while(left<=right)
       {
        if(arr[left]<=arr[right]) //left track
        {
             if(arr[left]>=leftMax)
             {
                leftMax=arr[left];
             }
             else
             {
                sum=sum+(leftMax-arr[left]);
             }
             left++;
        }
        else  //right track
        {
           if(arr[right]>=rightMax)
           {
            rightMax=arr[right];
           }
           else
           {
            sum=sum+(rightMax-arr[right]);
           }
           right--;
        }
       }
       return sum;
    }
}