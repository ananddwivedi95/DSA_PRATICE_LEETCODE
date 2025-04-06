class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       
        Arrays.sort(piles);
        int left=1;
        int right=piles[piles.length-1];
        while(left<right)
        {
            int mid=left+(right-left)/2;
            if(eatAllBanana(piles,mid,h))
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
    static boolean eatAllBanana(int[] piles,int mid,int h)
    {
        int totalTime=0;
        for(int i=0;i<piles.length;i++)
        {
            if(piles[i]%mid==0)
            {
                 totalTime=totalTime+piles[i]/mid;
            }
            else
            {
                if(piles[i]<=mid)
                {
                   totalTime=totalTime+1;
                }
                else
                {
                     totalTime=totalTime+piles[i]/mid;
                     totalTime=totalTime+1;
                }
            }
        }
        if(totalTime<=h)
        {
            return true;
        }
        return false;
    }
}