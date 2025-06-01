public class array12 {
    // Java program to find maximum Subarray Sum in Circular
    static int circularSubarraySum(int[] arr) {
        int n = arr.length;
        int res = arr[0];
        for(int i = 0; i < n; i++) {
            int currSum = 0;
            for(int j = 0; j < n; j++) {
                int idx = (i + j) % n;
                currSum = currSum + arr[idx];            
                res = Math.max(res, currSum);
            }
        }
        
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {8, -8, 9, -9, 10, -11, 12};
        System.out.println(circularSubarraySum(arr));
    }
}
