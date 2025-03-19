class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int first=0;
        int second=0;
        HashSet<Integer> hs= new HashSet<>();
        while(first<nums1.length&&second<nums2.length)
        {
            if(nums1[first]==nums2[second])
            {
                 hs.add(nums1[first]);
                 first++;
                 second++;
            }
            else if(nums1[first]>nums2[second])
            {
                second++;
            }
            else if(nums1[first]<nums2[second])
            {
                first++;
            }
        }
        int result[]=new int[hs.size()];
        int index=0;
        for(int i: hs)
        {
            result[index++]=i;
        }

        return result;
    }
}