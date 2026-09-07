import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if (p.length() > s.length()) {
            return result;
        }

        int[] countP = new int[26];
        int[] countWindow = new int[26];

        for (char c : p.toCharArray()) {
            countP[c - 'a']++;
        }

        int window = p.length();

        for (int i = 0; i < s.length(); i++) {

            countWindow[s.charAt(i) - 'a']++;

            if (i >= window) {
                countWindow[
                    s.charAt(i - window) - 'a'
                ]--;
            }

            if (Arrays.equals(countP, countWindow)) {
                result.add(i - window + 1);
            }
        }

        return result;
    }
}

Input
s = "cbaebabacd"
p = "abc"
Output
[0,6]
