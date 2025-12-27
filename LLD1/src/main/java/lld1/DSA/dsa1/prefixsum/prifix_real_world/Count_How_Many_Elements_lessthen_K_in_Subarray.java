package lld1.DSA.dsa1.prefixsum.prifix_real_world;

import java.util.*;

public class Count_How_Many_Elements_lessthen_K_in_Subarray {
    //3) Count How Many Elements ≤ K in Subarray (Easy–Medium)
    //Given an array and many queries (L, R, K), return count of numbers ≤ K in that range.
    //(Use prefix sums after frequency compression.)
    //Test Cases
    //arr=[1,4,2,6,3], query=(1,4,3) → numbers ≤3 are 1
    //query=(0,2,10) → all → 3
    //query=(2,2,1) → arr[2]=2 >1 → 0
    public static int[] solve(int[]arr,int[][]queries) {

        int n = arr.length;
        int q = queries.length;

        // Step 1: Find maximum value
        int value = 0;
        for (int x : arr) {
            if (x > value) {
                value = x;
            }
        }

        // Step 2: Build prefix sums for each value
        int[][] prefix = new int[value + 1][n];
        for (int i = 0; i < n; i++) {
            prefix[arr[i]][i] = 1;
        }

        for (int val = 0; val <= value; val++) {
            for (int i = 1; i < n; i++) {
                prefix[val][i] += prefix[val][i - 1];
            }
        }

        // Step 3: Answer queries
        int[] ans = new int[q];
        for (int i = 0; i < q; i++) {
            int L = queries[i][0];
            int R = queries[i][1];
            int K = queries[i][2];

            int count = 0;
            for (int val = 0; val <= K && val <= value; val++) {
                if (L == 0) count += prefix[val][R];
                else count += prefix[val][R] - prefix[val][L - 1];
            }
            ans[i] = count;
        }
        return ans;
    }
    public static int[] optamisedApproch(int[]arr,int[][]queries){
        int n = arr.length;
        int q = queries.length;

        // Step 1: Frequency Compression
        Set<Integer> set = new HashSet<>();
        for (int val : arr) {
            set.add(val);
        }
        List<Integer> sorting = new ArrayList<>(set);
        Collections.sort(sorting);

        // Map original value to compressed index
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < sorting.size(); i++) {
            map.put(sorting.get(i), i);
        }

        int m = sorting.size(); // number of unique values

        // Step 2: Build prefix sums for each compressed value
        int[][] prefix = new int[m][n];
        for (int i = 0; i < n; i++) {
            int compVal = map.get(arr[i]);
            prefix[compVal][i] = 1;
        }

        // Make prefix sums cumulative along the array
        for (int val = 0; val < m; val++) {
            for (int i = 1; i < n; i++) {
                prefix[val][i] += prefix[val][i - 1];
            }
        }

        // Step 3: Answer queries
        int[] ans = new int[q];
        for (int i = 0; i < q; i++) {
            int L = queries[i][0];
            int R = queries[i][1];
            int K = queries[i][2];

            // Find largest compressed value <= K
            int compK = -1;
            for (int j = 0; j < m; j++) {
                if (sorting.get(j) <= K) compK = j;
                else break;
            }

            if (compK == -1) {
                ans[i] = 0; // no values ≤ K
                continue;
            }

            int count = 0;
            for (int val = 0; val <= compK; val++) {
                count += prefix[val][R];
                if (L > 0) count -= prefix[val][L - 1];
            }
            ans[i] = count;
        }

        return ans;
    }
    public static void main(String[] args) {

        int[]calories = {1,4,2,6,3};
        int[][]q={
                {1,4,3},
                {0,2,10},
                {2,2,1}
        };

        int[]ans=solve(calories,q);
        for(int x:ans){
            System.out.print(" "+x+" ");
        }
        System.out.println();
        int[]ans1=optamisedApproch(calories,q);
        for(int x:ans1){
            System.out.print(" "+x+" ");
        }

    }
}
