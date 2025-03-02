class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer, Integer> tm = new TreeMap<>();
            int i = 0; // for nums1
            int j = 0; // for nums2

            // Merge both sorted arrays into TreeMap
            while (i < nums1.length && j < nums2.length) {
                if (nums1[i][0] == nums2[j][0]) {
                    tm.put(nums1[i][0], nums1[i][1] + nums2[j][1]);
                    i++;
                    j++;
                } else if (nums1[i][0] < nums2[j][0]) {
                    tm.put(nums1[i][0], nums1[i][1]);
                    i++;
                } else {
                    tm.put(nums2[j][0], nums2[j][1]);
                    j++;
                }
            }

            // Add remaining elements from nums1
            while (i < nums1.length) {
                tm.put(nums1[i][0], nums1[i][1]);
                i++;
            }

            // Add remaining elements from nums2
            while (j < nums2.length) {
                tm.put(nums2[j][0], nums2[j][1]);
                j++;
            }

            // Convert sorted TreeMap to a 2D array
            int[][] result = new int[tm.size()][2];
            int index = 0;
            for (Map.Entry<Integer, Integer> entry : tm.entrySet()) {
                result[index][0] = entry.getKey();
                result[index][1] = entry.getValue();
                index++;
            }
            return result;
    }
}