package lld1.DSA.dsa1.subarrays;

public class Maximum_subarray_sum {
//Given an array A of length N, Find the maximum subarray sum out of all possible non-empty subarray.
//Explanation 1:
//Subarray with maximum sum is [41, 36, -13, 14] with sum 78.
//Explanation 2:
//Subarray with maximum sum is [2, 34, -1, 16, 23, 12, 41] with sum 127.
    public static void bruteFroce(int[]arr){
        int n=arr.length;
          int sum=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(sum>0) {
                sum += arr[i];
            }else {
                sum=arr[i];
            }
            if(sum>max){
                max=sum;
            }

        }
        System.out.print(max+" ");
    }
    public static void main(String[] args) {
        int[]stocksProfits = {41, 36, -13, 14, -25};
        bruteFroce(stocksProfits);
        System.out.println("_______");
        int[]stocksProfits1 = {-2, 2, 34, -1, 16, 23, 12, 41, -7, -32};
        bruteFroce(stocksProfits1);
    }
}
