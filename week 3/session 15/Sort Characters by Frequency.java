import java.util.*;

class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Sort characters by frequency
        List<Character> chars =
            new ArrayList<>(map.keySet());

        chars.sort((a, b) ->
            map.get(b) - map.get(a)
        );

        StringBuilder result = new StringBuilder();

        for (char c : chars) {

            int count = map.get(c);

            for (int i = 0; i < count; i++) {
                result.append(c);
            }
        }

        return result.toString();
    }
}

Input
s = "tree"
Output
"eert"
