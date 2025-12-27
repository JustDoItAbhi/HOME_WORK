package lld1.DSA.dsa1.subarrays;

public class Good_Subarrays_Easy {
//Given an array of integers A, a subarray of an array is said to be good if it fulfills any one of the criteria:
//1. Length of the subarray is be even, and the sum of all the elements of the subarray must be less than B.
//2. Length of the subarray is be odd, and the sum of all the elements of the subarray must be greater than B.
//Your task is to find the count of good subarrays in A.
    public static int bruteFroce(int[]arr, int B){
    int n=arr.length;
    int sum=0;
    int evenSum=0;
    int oddMax=0;

            for(int i=0;i<n;i++){
                if(n%2==0) {
                    sum+=i;
                    System.out.println("sum for ODD val  "+sum);
                    if (sum <= B) {
                        oddMax = sum;
                        return oddMax;
                    }
                }else {
                    sum+=i;
                    System.out.println("sum for even val  "+sum);
                    if (sum >= B) {
                        evenSum = sum;
                        return evenSum;
                    }
                }
            }
//        }//sum of all the elements of the subarray must be greater than B
        return 0;
    }

    public static void main(String[] args) {
        int[]arr = {1, 2, 3, 4, 5};//6
        int a=4;

        System.out.println(bruteFroce(arr,a));


        System.out.println("_______");//36
        int[]arr1 = {13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9};
        int c=65;

//        System.out.println(improvisedApporch(arr1));
        System.out.println(bruteFroce(arr1,c));

    }
}
