public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {

    }

    public static int lengthOfLongestSubstring(String s) {
        int maxSubstringLength = Integer.MIN_VALUE;
        String subString = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (subString.contains(Character.toString(c))) {
                maxSubstringLength = subString.length();

            }
        }
        return 9;
    }
}
