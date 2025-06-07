import java.util.ArrayList;

public class strings18 {

    // KMP search function
    ArrayList<Integer> search(String pat, String txt) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = txt.length();
        int m = pat.length();

        // Step 1: Compute LPS array
        int[] lps = computeLPSArray(pat);

        // Step 2: KMP pattern search
        int i = 0, j = 0;
        while (i < n) {
            if (txt.charAt(i) == pat.charAt(j)) {
                i++;
                j++;
            }

            if (j == m) {
                result.add(i - j); // match found
                j = lps[j - 1];    // move j to previous longest prefix
            } else if (i < n && txt.charAt(i) != pat.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        return result;
    }

    // Helper function to compute the LPS array
    private int[] computeLPSArray(String pat) {
        int m = pat.length();
        int[] lps = new int[m];
        int len = 0, i = 1;

        while (i < m) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }

    // Main method for testing
    public static void main(String[] args) {
        strings18 sol = new strings18();

        // Test Case 1
        String txt1 = "abcab";
        String pat1 = "ab";
        System.out.println("Output 1: " + sol.search(pat1, txt1)); // Expected: [0, 3]

        // Test Case 2
        String txt2 = "abesdu";
        String pat2 = "edu";
        System.out.println("Output 2: " + sol.search(pat2, txt2)); // Expected: []

        // Test Case 3
        String txt3 = "aabaacaadaabaaba";
        String pat3 = "aaba";
        System.out.println("Output 3: " + sol.search(pat3, txt3)); // Expected: [0, 9, 12]
    }
}
