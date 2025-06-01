public class array13 {

    // Static nested class so it can be accessed in static main method
    public static class Solution {

        // Function to find the smallest positive number missing from the array.
        public int missingNumber(int[] arr) {
            int n = arr.length;

            // Step 1: Place elements at their correct positions (1-based index logic)
            for (int i = 0; i < n; i++) {
                while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                    // Swap arr[i] and arr[arr[i] - 1]
                    int correctIndex = arr[i] - 1;
                    int temp = arr[i];
                    arr[i] = arr[correctIndex];
                    arr[correctIndex] = temp;
                }
            }

            // Step 2: Find the first missing positive number
            for (int i = 0; i < n; i++) {
                if (arr[i] != i + 1) {
                    return i + 1;
                }
            }

            // Step 3: If all are correct, then the missing number is n + 1
            return n + 1;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr1 = {2, -3, 4, 1, 1, 7};
        System.out.println("Missing number: " + sol.missingNumber(arr1)); // Output: 3

        int[] arr2 = {5, 3, 2, 5, 1};
        System.out.println("Missing number: " + sol.missingNumber(arr2)); // Output: 4

        int[] arr3 = {-8, 0, -1, -4, -3};
        System.out.println("Missing number: " + sol.missingNumber(arr3)); // Output: 1
    }
}
