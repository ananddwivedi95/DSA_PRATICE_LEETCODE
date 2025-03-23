class Solution {
    public int subarraySum(int[] arr, int k) 
    {

    int j=0;
    int result=0;
    HashMap<Integer,Integer> hs= new HashMap<>();
    hs.put(0,1);
    int sum=0;
    while(j<arr.length)
    {
        sum+=arr[j];
        int required=sum-k;
        if(hs.containsKey(required))
        {
            result+=hs.get(required);
        }
        hs.put(sum,hs.getOrDefault(sum,0)+1);
        j++;
    }
    return result;
    }
}