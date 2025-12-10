package lld1.LLD1.dsa1.prefixsum.prifix_real_world;

public class Maximum_Profit_in_Stock_Over_K_Days {
    //4) Maximum Profit in Stock Over k Days (Medium–Hard)
    //Problem: Given profit[i] per day, find maximum sum of any subarray of length k.
    //Input:
    //profit = [3, 2, 7, 10, 1]
    //k = 3
    //Output:
    //19   // subarray [2,7,10]
    public static int solve(int[]arr,int k){
        int n = arr.length;
        if(n<k){
            return 0;
        }
        int[] prefix = new int[n + 1];
        prefix[0] = 0;
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }

        // Step 2: Find maximum sum of any subarray of length k
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= n - k; i++) {
            int currentSum = prefix[i + k] - prefix[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;

    }

    public static int bruteFroce(int[]arr,int k){
        if (arr.length < k) {
            return 0;
        }
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length - k; i++) {
            int currentSum = 0;
            for (int j = i; j < i + k; j++) {
                System.out.print(arr[j]+" ");
                currentSum += arr[j];
            }
            System.out.println();
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[]stocksProfits = {3, 2, 7, 10, 1};
        int days=3;

        System.out.println(solve(stocksProfits,days));
        System.out.println();
        System.out.println(bruteFroce(stocksProfits,days));

    }
}
