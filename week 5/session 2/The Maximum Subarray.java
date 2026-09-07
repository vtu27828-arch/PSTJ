import java.util.*;

public class Solution {

    public static int[] maxSubarray(List<Integer> arr) {

        int current = arr.get(0);
        int maxSubarray = arr.get(0);

        int maxSubsequence = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {

            int value = arr.get(i);

            current = Math.max(value, current + value);

            maxSubarray = Math.max(maxSubarray, current);

            maxSubsequence = Math.max(
                maxSubsequence,
                maxSubsequence + value
            );
        }

        return new int[] {
            maxSubarray,
            maxSubsequence
        };
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }

            int[] result = maxSubarray(arr);

            System.out.println(result[0] + " " + result[1]);
        }

        sc.close();
    }
}

Input
2
4
1 2 3 4
6
2 -1 2 3 4 -5
Output
10 10
10 11
