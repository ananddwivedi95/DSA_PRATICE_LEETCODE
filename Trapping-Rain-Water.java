class Solution {
    // public int trap(int[] arr) {
       
    //    // using 2 pointer approch
    //    int left=0; // for left track element
    //    int right=arr.length-1;  //for right track element
    //    int leftMax=0;
    //    int rightMax=0;
    //    int sum=0;
    //    while(left<=right)
    //    {
    //     if(arr[left]<=arr[right]) //left track
    //     {
    //          if(arr[left]>=leftMax)
    //          {
    //             leftMax=arr[left];
    //          }
    //          else
    //          {
    //             sum=sum+(leftMax-arr[left]);
    //          }
    //          left++;
    //     }
    //     else  //right track
    //     {
    //        if(arr[right]>=rightMax)
    //        {
    //         rightMax=arr[right];
    //        }
    //        else
    //        {
    //         sum=sum+(rightMax-arr[right]);
    //        }
    //        right--;
    //     }
    //    }
    //    return sum;
    // }

    public int trap(int[] arr)
    {
        //using prefix sum method
        int[] leftmax=new int[arr.length];
        leftmax[0]=0;
        int[] rightmax=new int[arr.length];
        rightmax[rightmax.length-1]=0;
       
       // for left side maximum
        for(int i=1;i<leftmax.length;i++)
        {
            leftmax[i]=Math.max(leftmax[i-1],arr[i-1]);
        }

        //for right side maximum

        for(int i=rightmax.length-2;i>=0;i--)
        {
            rightmax[i]=Math.max(rightmax[i+1],arr[i+1]);
        }

        // main calculation
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            int min=Math.min(leftmax[i],rightmax[i]);
            if(min-arr[i]>=0)
            {
                sum=sum+(min-arr[i]);
            }
        }
        return sum;
    }
}