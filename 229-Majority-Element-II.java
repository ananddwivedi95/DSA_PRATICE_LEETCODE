public class Solution {
    public static List<Integer> majorityElement(int[] arr) {
        int count1 = 0, count2 = 0;
        int element1 = Integer.MIN_VALUE, element2 = Integer.MIN_VALUE;
        ArrayList<Integer> result = new ArrayList<>();

        // Step 1: Find potential candidates for majority element
        for (int i = 0; i < arr.length; i++) {
            if (count1 == 0 && element2 != arr[i]) {
                element1 = arr[i];
                count1 = 1;
            } else if (count2 == 0 && element1 != arr[i]) {
                element2 = arr[i];
                count2 = 1;
            } else if (element1 == arr[i]) {
                count1++;
            } else if (element2 == arr[i]) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        // Step 2: Count occurrences of the two potential candidates
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element1) {
                count1++;
            } else if (arr[i] == element2) {
                count2++;
            }
        }

        // Step 3: Check if the candidates appear more than n / 3 times
        if (count1 > arr.length / 3) {
            result.add(element1);
        }
        if (count2 > arr.length / 3) {
            result.add(element2);
        }

        return result;
    
}

    }