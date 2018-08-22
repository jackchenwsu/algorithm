package jackchen.algorithm.String;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {

    /*
     * 3. Given a string, find the length of the longest substring without repeating characters.
     */
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;

        HashMap<Character, Integer> map = new HashMap();

        int max = 0;
        for (int i = 0, j = 0; j < s.length(); j++) {

            if (map.containsKey(s.charAt(j))) {
                i = Math.max(i, map.get(s.charAt(j)) + 1);
            }
            map.put(s.charAt(j), j);
            max = Math.max(max, j - i + 1);
        }

        return max;
    }
}
