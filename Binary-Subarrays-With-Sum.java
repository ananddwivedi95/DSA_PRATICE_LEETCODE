class Solution {
    public int numSubarraysWithSum(int[] arr, int goal) {

      //most optical way just as a subArray sum of k
      int j=0;
      int result=0;
      int sum=0;
      HashMap<Integer,Integer> hs= new HashMap<>();
      hs.put(0,1);
      while(j<arr.length)
      {
        sum+=arr[j];
        int required=sum-goal;
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