package lld1.DSA.dsa1.subarrays;

public class SumofAllSubarrays {
//You have to find the sum of all subarray sums of A.
//More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero
// or more elements from either end of the array.
//A subarray sum denotes the sum of all the elements of that subarray.
//Note : Be careful of integer overflow issues while calculations. Use appropriate datatypes.

    public static int bruteFroce(int[]arr){
        int n=arr.length;
        int total=0;
        int sum=0;
        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    total=sum;
//                    System.out.println(" total "+total+" sum "+sum);
                }
            }
        }
        return total;
    }
    public static int improvisedApporch(int []arr){
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i]*((i+1)*(n-i));
        }
        return sum;
    }
    public static void main(String[] args) {
        int[]stocksProfits = {1,2,3};//20
        System.out.println(bruteFroce(stocksProfits));
        System.out.println(improvisedApporch(stocksProfits));
        System.out.println("_______");
        int[]stocksProfits1 = {2,1,3};
        System.out.println(improvisedApporch(stocksProfits1));
        System.out.println(bruteFroce(stocksProfits1));// 19

//        1 = 1;
//        1+2=3;
//        1+2+3=6;
//
//        2=2;
//        2+3=5;
//
//        3=3;
//        and=1+3+6+2+5+3=20;


    }
}
