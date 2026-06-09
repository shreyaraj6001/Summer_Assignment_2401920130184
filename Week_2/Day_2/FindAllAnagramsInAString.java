import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (s.length() < p.length())
            return ans;

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        // Frequency count of p
        for (char ch : p.toCharArray()) {
            pCount[ch - 'a']++;
        }

        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            // Add current char
            sCount[s.charAt(right) - 'a']++;

            // Maintain window size
            if (right - left + 1 > p.length()) {
                sCount[s.charAt(left) - 'a']--;
                left++;
            }

            // Compare arrays
            if (Arrays.equals(sCount, pCount)) {
                ans.add(left);
            }
        }

        return ans;
    }
}
