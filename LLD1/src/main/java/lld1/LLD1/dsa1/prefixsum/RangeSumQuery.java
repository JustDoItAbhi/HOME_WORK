package lld1.LLD1.dsa1.prefixsum;

public class RangeSumQuery {

    // Prefix sum optimized approach
    public static int[] prefixSum(int[] arr, int[][] query) {

        int n = arr.length;
        int qn = query.length;

        // Build prefix sum
        int[] ps = new int[n];
        ps[0] = arr[0];

        for (int i = 1; i < n; i++) {
            ps[i] = ps[i - 1] + arr[i];
        }

        // Process queries
        int[] ans = new int[qn];

        for (int i = 0; i < qn; i++) {
            int L = query[i][0];
            int R = query[i][1];

            if (L == 0)
                ans[i] = ps[R];
            else
                ans[i] = ps[R] - ps[L - 1];
        }

        return ans;
    }

    // Brute force method
    public static int[] bruteForce(int[] arr, int[][] query) {
        int qn = query.length;
        int[] ans = new int[qn];

        for (int i = 0; i < qn; i++) {
            int L = query[i][0];
            int R = query[i][1];
            int sum = 0;

            for (int j = L; j <= R; j++) {
                sum += arr[j];
            }
            ans[i] = sum;
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {3, 4, -2, 6, 8, 10, 13, 1};

        // Correct query format: {L, R}
        int[][] query = {
                {1, 3},   // arr[1] + arr[2] = 4 + (-2) = 2
                {2, 6},    // 6+8+10+13 = 37
                {5,5},
                {0,3},
        };

        int[] ans1 = prefixSum(arr, query);
        System.out.println("Using Prefix Sum:");
        for (int x : ans1) System.out.print(x + " ");

        System.out.println("\nUsing Brute Force:");
        int[] ans2 = bruteForce(arr, query);
        for (int x : ans2) System.out.print(x + " ");
    }
}
