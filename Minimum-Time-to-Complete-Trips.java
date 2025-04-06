class Solution {
    public long minimumTime(int[] time, int totalTrip) {
        Arrays.sort(time);
        long min_Time=time[0];
        long left=0;
        long right=min_Time*totalTrip;
        while(left<right)
        {
            long mid=left+(right-left)/2;
            if(possibleTrip(time,totalTrip,mid))
            {
                right=mid;
            }
            else
            {
                left=mid+1;
            } 
        }
        return right;
    }
    static boolean possibleTrip(int[] time,long totalTrip,long mid)
    {
        long total_Required=0;
        for(int i=0;i<time.length;i++)
        {
           total_Required+=mid/time[i];
        }
        if(total_Required>=totalTrip)
        {
           return true;
        }
        return false;
    }
}