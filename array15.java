public class array15 {
    public static String addBinary(String s1, String s2) {
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;

        // Loop through both strings from the end
        while (i >= 0 || j >= 0 || carry != 0) {
            int bit1 = (i >= 0) ? s1.charAt(i--) - '0' : 0;
            int bit2 = (j >= 0) ? s2.charAt(j--) - '0' : 0;

            int sum = bit1 + bit2 + carry;
            sb.append(sum % 2);       // Append result bit
            carry = sum / 2;          // Calculate new carry
        }

        // Remove leading zeros
        while (sb.length() > 1 && sb.charAt(sb.length() - 1) == '0') {
            sb.setLength(sb.length() - 1);
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("1101", "111"));      // Output: 10100
        System.out.println(addBinary("00100", "010"));     // Output: 110
        System.out.println(addBinary("0000", "0"));        // Output: 0
        System.out.println(addBinary("1", "1111111"));     // Output: 10000000
    }

}
