

public class array11 {

    // Function to return the product of max product subarray
    static int maxProduct(int arr[]) { 
        int n = arr.length;

        // Initializing result
        int result = arr[0];

        for (int i = 0; i < n; i++) {
            int mul = 1;

            // Traversing in current subarray
            for (int j = i; j < n; j++) {
                mul *= arr[j];

                // Updating result to keep track of the maximum product
                result = Math.max(result, mul);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { -2, 6, -3, -10, 0, 2 };
        System.out.println("Maximum product subarray: " + maxProduct(arr));
    }
}
