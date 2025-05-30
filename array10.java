class Solution {
    public int maxSubarraySum(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}

public class array10 {
    public static void main(String[] args) {
        // Example input arrays
        int[] arr1 = {2, 3, -8, 7, -1, 2, 3};
        int[] arr2 = {-2, -4};
        int[] arr3 = {5, 4, 1, 7, 8};

        Solution sol = new Solution();

        System.out.println("Maximum subarray sum (Test 1): " + sol.maxSubarraySum(arr1)); // Output: 11
        System.out.println("Maximum subarray sum (Test 2): " + sol.maxSubarraySum(arr2)); // Output: -2
        System.out.println("Maximum subarray sum (Test 3): " + sol.maxSubarraySum(arr3)); // Output: 25
    }
}

