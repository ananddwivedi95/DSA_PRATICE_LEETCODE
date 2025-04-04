class Solution {
    public int singleNonDuplicate(int[] arr) {
       
       int left=0;
       int right=arr.length-1;
       while(left<=right)
       {
        int mid=left+(right-left)/2;
        if(left==right)
        {
            return arr[left];
        }
        else if(arr[mid]==arr[mid+1])
        {
            if((right-mid)%2==0)  //present at right side
            {
               left=mid+1;
            }
            else  //present at left side
            {
             right=mid-1;    
            }
        }
        else if(arr[mid]!=arr[mid+1])
        {
            if((right-mid)%2==0)  //present at left side
            {
                right=mid;
            }
            else   // present at right side
            {
                left=mid+1;
            }
        }
       }
       return 0;
    }
}