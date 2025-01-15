class Solution {
    public int majorityElement(int[] arr) {
       HashMap<Integer,Integer> HS= new HashMap();
\t\tfor(int i=0;i<arr.length;i++)
\t\t{
\t\t\tif(HS.containsKey(arr[i]))
\t\t\t{
\t\t\t\tHS.put(arr[i],HS.get(arr[i])+1);
\t\t\t}
\t\t\telse
\t\t\t{
\t\t\t   HS.put(arr[i], 1);\t
\t\t\t}
\t\t}
\t\tint majorityElement=0;
\t\tfor (Integer key : HS.keySet()) {
            if (HS.get(key) > arr.length/2) {
                return key;
            }
        }
        return 0;
    }
}