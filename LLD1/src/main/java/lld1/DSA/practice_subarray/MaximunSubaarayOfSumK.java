package lld1.DSA.practice_subarray;

public class MaximunSubaarayOfSumK {
    public static int solve(int [] arr , int k){
        int n=arr.length;
        if (k > n) return -1; // edge case

        // Sum of first window
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Slide the window
        for (int i = k; i < n; i++) {
            windowSum = windowSum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[]arr = {1, 2, 3, 4, 5};
        int k = 2;
        //Output: 9 (subarray [4,5])
        System.out.println("ans "+solve( arr,k));
        int[]arr1 = {2, 1, 5, 1, 3, 2};
        int l = 3;
        //Output: 9 (subarray [5,1,3])
        System.out.println(" ans1 "+solve(arr1,l));

        int[]arr2 = {1, -2, 3, -1, 2};
        int m = 2;
        //Output: 2 (subarray [3,-1])
        System.out.println(" ans2 "+ solve(arr2,m));

        int[]arr3 = {4, 2, 1, 7, 8, 1, 2, 8};
        int n = 3;
        //Output: 16 (subarray [7,8,1])
        System.out.println("ans3 "+ solve(arr3,n));

        int[]arr4 = {2, 3, 4, 1, 5};
        int o = 1;
        //Output: 5 (subarray [5])
        System.out.println("ans4 "+ solve(arr4,o));

    }
}
