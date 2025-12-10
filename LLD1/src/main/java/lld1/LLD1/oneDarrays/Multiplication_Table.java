package lld1.LLD1.oneDarrays;

public class Multiplication_Table {
    //Take a number A as input, print its multiplication table having the first 10 multiples.
    public static void solve(int n){
    for(int i=1;i<=10;i++){
        int ans=i*n;
        System.out.printf("%d * %d = %d \n",    i,n,ans);
    }
    }
    public static void main(String[] args) {
        int a=2;
        solve(a);
        System.out.println();
        int b=3;
        solve(b);
    }
}
