public class strings17 {
    // Function to return first non-repeating character
    static char nonRepeatingChar(String s) {
        int[] count = new int[26]; // Frequency array for a-z

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        // Find the first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return s.charAt(i);
            }
        }

        return '$'; // No non-repeating character found
    }

    // Main method to test the function
    public static void main(String[] args) {
        String[] testCases = {"geeksforgeeks", "racecar", "aabbccc"};

        for (String s : testCases) {
            char result = nonRepeatingChar(s);
            if (result == '$') {
                System.out.println("-1");
            } else {
                System.out.println(result);
            }
        }
    }
}
