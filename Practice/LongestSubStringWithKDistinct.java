import java.util.HashMap;
import java.util.Map;

public class LongestSubstringKDistinct {
    public static int lengthOfLongestSubstringKDistinct(String s, int K) {
        if (K == 0 || s == null || s.length() == 0) {
            return 0;
        }

        int left = 0;
        int maxLen = 0;
        Map<Character, Integer> charCount = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            // Add the character at 'right' to the map
            char currentChar = s.charAt(right);
            charCount.put(currentChar, charCount.getOrDefault(currentChar, 0) + 1);

            // If we have more than K distinct characters, shrink the window
            while (charCount.size() > K) {
                char leftChar = s.charAt(left);
                charCount.put(leftChar, charCount.get(leftChar) - 1);
                if (charCount.get(leftChar) == 0) {
                    charCount.remove(leftChar);
                }
                left++;
            }

            // Update the maximum length found
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String s = "eceba";
        int K = 2;
        System.out.println("Length of longest substring with at most " + K + " distinct characters: " + lengthOfLongestSubstringKDistinct(s, K));
        // Output: 3
    }
}
