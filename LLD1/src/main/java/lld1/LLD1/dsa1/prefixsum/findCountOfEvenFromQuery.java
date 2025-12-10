package lld1.LLD1.dsa1.prefixsum;

public class findCountOfEvenFromQuery {

    public static void solve(int[] arr, int[][] query) {
        int n = arr.length;
        int qn = query.length;

        // Build correct prefix sum of even numbers
        int[] pc = new int[n];
        pc[0] = arr[0] % 2 == 0 ? 1 : 0;

        for (int i = 1; i < n; i++) {
            pc[i] = pc[i - 1];   // carry previous value
            if (arr[i] % 2 == 0) {
                pc[i]++;        // increment for even numbers
            }
        }

        // Process queries
        int[] ans = new int[qn];

        for (int i = 0; i < qn; i++) {
            int L = query[i][0];
            int R = query[i][1];

            if (L == 0)
                ans[i] = pc[R];
            else
                ans[i] = pc[R] - pc[L - 1];

            System.out.print(" " + ans[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,5,8,9,16,14,13,12};

        int[][] query = {
                {1,5},
                {2,6},
                {4,5},
                {4,4},
                {3,6}
        };

        solve(arr, query);

        System.out.println("\n---");

        int[] arr2 = {3,4,9,8,5};

        int[][] query2 = {
                {0,3},
                {2,4}
        };

        solve(arr2, query2);
    }
}
