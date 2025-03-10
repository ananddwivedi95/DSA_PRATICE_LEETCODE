class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        int win=k+1;
        int i=0;
        int j=0;
        HashSet<Integer> hs= new HashSet<>();
        while(j<arr.length)
        {
            
            if(hs.contains(arr[j]))
            {
                return true;
            }
            hs.add(arr[j]);
            if(j-i>=k)
            {
                hs.remove(arr[i]);
                i++;
            }
            j++;
        }
        return false;
    }
}