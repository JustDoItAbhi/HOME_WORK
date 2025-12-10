package lld1.LLD1.oneDarrays;

public class Print_perfect_squares {
    public static int solve(int n){
        int sqrt=(int)Math.sqrt(n);
        int count=0;
      for(int i=1;i*i<=n;i++){
          count=i*i;
          System.out.print(count+" ");//test
      }
      return count;
    }
    public static void main(String[] args) {
        int a=20;
        System.out.println(solve(a));
        int b=100;
        System.out.println(solve(b));
    }
}
