package lld1.DSA.practice_subarray;

public class Minimum_sum_subarray {
    public static int solve(int[]arr){
        int n=arr.length;
        int currentSum=arr[0];
        int minSum=arr[0];
        for (int i=1;i<n;i++ ) {
        currentSum=Math.min(arr[i],currentSum+arr[i]);
        minSum=Math.min(minSum,currentSum);
        }

        return minSum;
    }
    public static void main(String[] args) {
        int[] arr = {3, -4, 2, -3, -1, 7, -5};
        //✅ Total Sum =-6
//        System.out.println(brute(arr));
        System.out.println("___⬇️⬇️__");
        System.out.println(solve(arr));
        System.out.println("___________");
        int[] arr1 = {1, 2, 3, 4};
        //✅ Total Sum = 1
//        System.out.println(brute(arr1));
        System.out.println("___⬇️⬇️__");
        System.out.println(solve(arr1));
        System.out.println("___________");
        int[] arr2 = {-1, -2, -3, -4};//-10
//        System.out.println(brute(arr2));
        System.out.println("___⬇️⬇️__");
        System.out.println(solve(arr2));
        //✅ Total Sum = 10
        System.out.println("___________");
        int[] arr3 = {3, -2, 5, -1};//-2
//        System.out.println(brute(arr3));
        System.out.println("___⬇️⬇️__");
        System.out.println(solve(arr3));
        //✅ Total Sum = -4
        System.out.println("___________");
        int[] arr4 = {3, -2, 5, 1};
        //✅ Total Sum = 34
//        System.out.println(brute(arr4));
        System.out.println("___⬇️⬇️__");
        System.out.println(solve(arr4));
    }
}
