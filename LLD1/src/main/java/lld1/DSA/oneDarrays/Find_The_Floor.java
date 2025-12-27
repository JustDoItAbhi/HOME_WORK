package lld1.DSA.oneDarrays;

public class Find_The_Floor {
public static void solve(int n) {
    double sum=n/200.0;
    double ans=  Math.floor(sum);
    System.out.print((int)ans+" ");
}

    public static void main(String[] args) {
        int c=2113;
        solve(c);
        System.out.println();
        int d=-2113;
        solve(d);
        System.out.println();

        int a=7;
        solve(a);
        System.out.println();
        int b=400;
        solve(b);
    }
    }

