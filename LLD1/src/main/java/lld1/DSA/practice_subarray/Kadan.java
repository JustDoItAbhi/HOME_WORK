package lld1.DSA.practice_subarray;

public class Kadan {
    public static int solve(int[]arr){
        int n=arr.length;
        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < n; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("sum " + maxSum);
        return maxSum;

    }
    public static int brute(int[]arr){
        int n=arr.length;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for (int j=i; j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    if(sum>ans){
                        ans=sum;
                    }
                }
            }
        }
        System.out.println();
        return ans;
    }



    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//        Maximum Sum = 6
        System.out.println(solve(arr));
        System.out.println(brute(arr));
        int[] arr1 = {1, 2, 3, 4};
//        Maximum Sum = 10
        System.out.println(solve(arr1));
        int[] arr2 = {-8, -3, -6, -2, -5, -4};
//        Maximum Sum = -2
        System.out.println(solve(arr2));
        int[] arr3 = {5};
//        Maximum Sum = 5
        System.out.println(solve(arr3));
//        Subarray = {5};
        int[] arr4 = {3, -2, 5, -1};
//        Maximum Sum = 6
        System.out.println(solve(arr4));


    }
}
