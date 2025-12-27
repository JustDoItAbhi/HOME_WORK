package lld1.DSA.oneDarrays;

public class Search_Element {
    //you are given array A and an integer B for each test case. You have to tell whether B is present in array A or not.
    public static int solve(int[]A, int b){
        int n=A.length;
        for(int i=0;i<n;i++){
            int count=0;
            if(A[i]==b){
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[]arr={4 ,1 ,5 ,9, 1};
        int a=5;
        System.out.println(solve(arr,a));
        int[]arr1={7,7,2};
        int b=1;
        System.out.println(solve(arr1,b));
    }
}
