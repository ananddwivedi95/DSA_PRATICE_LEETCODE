class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int i = 0;
        int j = 1;
        int index = 1; // Start from 1, as first element is always unique

        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                insert(j, nums, index); // Store unique element at index
                index++; // Move to next position
                i = j;
                j++;
                count++;
            }
        }
        return count;
    }

    static void insert(int j, int[] nums, int index) {
        nums[index] = nums[j]; // Store unique element in the correct position
    }
}