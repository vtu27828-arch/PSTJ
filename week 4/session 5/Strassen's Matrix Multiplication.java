class Solution {

    static void multiplyMatrices(int[][] a, int[][] b, int[][] res, int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                res[i][j] = 0;

                for (int k = 0; k < n; k++) {

                    res[i][j] += a[i][k] * b[k][j];
                }
            }
        }
    }
}

Input
a = [[7,8],
     [2,9]]

b = [[14,5],
     [5,18]]
Output
[[138,179],
 [73,172]]
