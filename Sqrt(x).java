class Solution {
    public int mySqrt(int x) {
        int left=1;
        int right=x;
        int result=0;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            long mid_Squrt=(long)mid*mid;
            if(mid_Squrt>x)
            {
                right=mid-1;
            }
            else if(mid_Squrt<=x)
            {
                result=mid;
                left=mid+1;
            }
        }
        return result;
    }
}