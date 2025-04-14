class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i:nums1)
        {
           map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> list= new ArrayList<>();
        for(int num:nums2)
        {
            if(map.containsKey(num)&&map.get(num)>0)
            {
                list.add(num);
                map.put(num,map.get(num)-1);
            }
        }
        int [] result= new int[list.size()];
        int index=0;
        for(int num:list)
        {
            result[index++]=num;
        }
        return result;
    }
}