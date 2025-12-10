package lld1.LLD1.oneDarrays;

public class MultiplesOfFour {
    //Given an integer input N, print all multiples of 4 less than or equal to N.
    public static void solve(int n) {
        for (int i = 4; i <= n; i += 4) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {

        int v= 22;
        solve(v);
        System.out.println();

        System.out.println();
        int a=16;
        solve(a);
        System.out.println();
    }
}
