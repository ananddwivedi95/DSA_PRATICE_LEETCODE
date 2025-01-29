class Solution {
    public void sortColors(int[] arr) {
      int low=0;
\t\t int mid=0;
\t\t int high=arr.length-1;
\t\t while(mid<=high)
\t\t {   int temp=0;
\t\t\t if(arr[mid]==0)
\t\t\t {
\t\t\t\ttemp=arr[mid];
\t\t\t\tarr[mid]=arr[low];
\t\t\t\tarr[low]=temp;
\t\t\t\tlow++;
\t\t\t\tmid++;
\t\t\t }
\t\t\t else if(arr[mid]==1)
\t\t\t {
\t\t\t\t mid++;
\t\t\t }
\t\t\t else if(arr[mid]==2)
\t\t\t {
\t\t\t\t temp=arr[mid];
\t\t\t\t arr[mid]=arr[high];
\t\t\t\t arr[high]=temp;
\t\t\t\t high--;
\t\t\t }
\t\t }
    }
}