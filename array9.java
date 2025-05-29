import java.util.Arrays;

// Solution class with the required method
class Solution {
    int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        if (n == 1)
            return 0;

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Initialize the difference
        int minDiff = arr[n - 1] - arr[0];

        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;

        for (int i = 1; i < n; i++) {
            if (arr[i] - k < 0)
                continue;

            int min = Math.min(smallest, arr[i] - k);
            int max = Math.max(largest, arr[i - 1] + k);

            minDiff = Math.min(minDiff, max - min);
        }

        return minDiff;
    }
}

// Main class to test the solution
public class array9 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr1 = {1, 5, 8, 10};
        int k1 = 2;
        System.out.println("Output 1: " + sol.getMinDiff(arr1, k1));  // Output: 5

        int[] arr2 = {3, 9, 12, 16, 20};
        int k2 = 3;
        System.out.println("Output 2: " + sol.getMinDiff(arr2, k2));  // Output: 11
    }
}
