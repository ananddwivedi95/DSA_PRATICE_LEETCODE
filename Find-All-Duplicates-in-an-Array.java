class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> result= new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()>1)
            {
                result.add(entry.getKey());
            }
        }
        return result;
    }
}