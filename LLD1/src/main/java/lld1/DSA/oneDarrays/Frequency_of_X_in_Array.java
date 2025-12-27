package lld1.DSA.oneDarrays;

public class Frequency_of_X_in_Array {

    public static int solve(int[]A,int B){
        int n=A.length;
        int count=0;
        for(int i=0;i<n;i++){
                   if(A[i]==B){
                   count++;

            }

        }
        return count;
    }

    public static void main(String[] args) {
        int[]arr={1, 1, 2, 4, 2};
        int B=2;
        System.out.println(solve(arr,B));
        int[]arr1={4, 2, 3, 4, 4};
        int c=4;
        System.out.println(solve(arr1,c));
    }
}
