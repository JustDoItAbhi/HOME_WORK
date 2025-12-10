package lld1.LLD1.oneDarrays;

public class Check_Is_Sorted {
    public  static  int solve(int[]A){
        int n=A.length;
        for(int i=0;i<n-1;i++){
            if(A[i]<=A[i+1]){

            }else {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[]A = {1, 2, 2};
        System.out.println(solve(A));
        int[]b = {1, 2, 1};
        System.out.println(solve(b));

    }
}
