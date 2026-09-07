import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            String s = sc.next();

            int n = s.length();

            int[] left = new int[26];
            int[] right = new int[26];

            for (int i = 0; i < n / 2; i++) {
                left[s.charAt(i) - 'a']++;
            }

            for (int i = (n + 1) / 2; i < n; i++) {
                right[s.charAt(i) - 'a']++;
            }

            if (Arrays.equals(left, right)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}


Input
5
gaga
abcde
rotor
xyzxy
abba
Output
YES
NO
YES
NO
YES
