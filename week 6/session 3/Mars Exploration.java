import java.util.*;

public class Solution {

    public static int marsExploration(String s) {

        int changes = 0;

        for (int i = 0; i < s.length(); i++) {

            char expected;

            if (i % 3 == 0) {
                expected = 'S';
            } else if (i % 3 == 1) {
                expected = 'O';
            } else {
                expected = 'S';
            }

            if (s.charAt(i) != expected) {
                changes++;
            }
        }

        return changes;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(marsExploration(s));

        sc.close();
    }
}

Input
SOSSPSSQSSOR
Output
3
