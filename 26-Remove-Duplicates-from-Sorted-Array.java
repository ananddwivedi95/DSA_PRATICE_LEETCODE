class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int i = 0;
        int j = 1;
        int index = 0; // Start from 1, as first element is always unique

        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                nums[++index]=nums[j]; // Store unique element at index
                i = j;
                j++;
                count++;
            }
        }
        return count;
    }
}