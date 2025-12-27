package lld1.DSA.dsa1.prefixsum.prifix_real_world;

public class twoD_PrefixSum_Rainwater_City_Grid {
   // 2D Prefix Sum – Rainwater on a City Grid (Hard)
    //Problem: Given grid water[i][j], answer queries (r1, c1, r2, c2) → total rainfall in rectangle.
    //Input:
    //grid = [
    //  [1, 2, 3],
    //  [4, 5, 6],
    //  [7, 8, 9]
    //]
    //queries = [(0,0,1,1), (1,1,2,2), (0,0,2,2)]

    //Output:[12, 28, 45]
    public static int[] solve(int[][] arr, int[][] q) {
        int n = arr.length;
        int m = arr[0].length;

        // Step 1: Build 2D prefix sum array
        int[][] prefix = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                // Formula: prefix[i][j] = arr[i-1][j-1] + prefix[i-1][j] + prefix[i][j-1] - prefix[i-1][j-1]
                prefix[i][j] = arr[i - 1][j - 1]
                        + prefix[i - 1][j]
                        + prefix[i][j - 1]
                        - prefix[i - 1][j - 1];
            }
        }

        // Step 2: Answer each query in O(1) time
        int[] ans = new int[q.length];

        for (int i = 0; i < q.length; i++) {
            int r1 = q[i][0];
            int c1 = q[i][1];
            int r2 = q[i][2];
            int c2 = q[i][3];

            // Formula: sum = prefix[r2+1][c2+1] - prefix[r1][c2+1] - prefix[r2+1][c1] + prefix[r1][c1]
            ans[i] = prefix[r2 + 1][c2 + 1]
                    - prefix[r1][c2 + 1]
                    - prefix[r2 + 1][c1]
                    + prefix[r1][c1];
        }

        return ans;
    }





    public static void main(String[] args) {
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] queries = {
                {0, 0, 1, 1},  // Top-left 2x2
                {1, 1, 2, 2},  // Bottom-right 2x2
                {0, 0, 2, 2}   // Entire grid
        };

        int[] ans = solve(grid, queries);

        System.out.print("Results: ");
        for (int x : ans) {
            System.out.print(x + " ");
        }
        // Expected Output: 12 28 45
    }
}