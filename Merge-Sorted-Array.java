class Solution {
    public void merge(int[] arr, int m, int[] arr_r, int n) {
    \tint index=0;
    \tfor(int i=0;i<arr.length;i++)
    \t{
    \t\tif(i>=m)
    \t\t{
    \t\t\tarr[i]=arr_r[index++];
    \t\t}
    \t}
    \tArrays.sort(arr);
    \t
    }
}