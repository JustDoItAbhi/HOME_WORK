package lld1.DSA.oneDarrays;

public class ProductOfArray {
    public static int solve(int[]arr){
        int n=arr.length;
        int sum=1;
        for(int i=0;i<n;i++){
            sum*=arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[]arr={ 7, 9, 2, 51};

        System.out.println(solve(arr));
        int[]arr1={ 2, 3, 5, 1};
        System.out.println(solve(arr1));
    }
}
