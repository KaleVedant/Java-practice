public class strings16 {
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] freq = new int[26]; // for 'a' to 'z'

        // Increment for s1, decrement for s2
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }

        // Check if all frequencies are zero
        for (int count : freq) {
            if (count != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("geeks", "kseeg"));      // true
        System.out.println(isAnagram("allergy", "allergic")); // false
        System.out.println(isAnagram("g", "g"));               // true
    }
}

