package lld1.DSA.oneDarrays;

public class SumOfArray {
    public static int solve(int[]arr){
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        System.out.println(solve(arr));
        int[]arr1={10,50,40,80};
        System.out.println(solve(arr1));
    }
}
