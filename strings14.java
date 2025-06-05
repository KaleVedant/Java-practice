public class strings14 {
    public static int myAtoi(String s) {
        int i = 0, n = s.length();
        int sign = 1;
        long result = 0;

        // Step 1: Skip leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Step 2: Handle sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Step 3: Read digits
        while (i < n && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');

            // Step 4: Clamp on overflow
            if (sign == 1 && result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign == -1 && -result < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }

        return (int)(sign * result);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Test cases
        String[] testInputs = {
            "-123",
            "  -",
            " 1231231231311133",
            "-999999999999",
            "  -0012gfg4",
            "42",
            "words and 987",
            "   +0 123"
        };

        for (String input : testInputs) {
            int result = myAtoi(input);
            System.out.println("Input: \"" + input + "\" => Output: " + result);
        }
    }
}
