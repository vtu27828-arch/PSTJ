import java.util.*;

public class Solution {

    static int longestPalindrome(String s) {

        int max = 1;

        for (int i = 0; i < s.length(); i++) {

            // Odd length palindrome
            int left = i;
            int right = i;

            while (left >= 0 &&
                   right < s.length() &&
                   s.charAt(left) == s.charAt(right)) {

                max = Math.max(max, right - left + 1);

                left--;
                right++;
            }

            // Even length palindrome
            left = i;
            right = i + 1;

            while (left >= 0 &&
                   right < s.length() &&
                   s.charAt(left) == s.charAt(right)) {

                max = Math.max(max, right - left + 1);

                left--;
                right++;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            String s = sc.next();

            int n = s.length();

            String doubled = s + s;

            for (int i = 0; i < n; i++) {

                String rotation =
                    doubled.substring(i, i + n);

                System.out.print(
                    longestPalindrome(rotation) + " "
                );
            }

            System.out.println();
        }

        sc.close();
    }
}

Input
1
aaaa
Output
4 4 4 4
