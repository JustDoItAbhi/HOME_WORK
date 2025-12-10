package lld1.LLD1.oneDarrays;

public class Sum_of_Odds {
    //Take an integer A as input. You have to print the sum of all odd numbers in the range [1, A].
    //Explanation 1:
    // For A = 1, 1 is the only odd number which lies in the range [1, 1].
    //Explanation 2:
    // For A = 4, Odd numbers 1 and 3 lie in the range [1, 4].
    // Sum = 1 + 3 = 4.
    public static int improvisedApproch(int A) {
        int n = (A + 1) / 2;
        return n * n;
    }
    public static int solve(int a){
        int sum=0;
        for(int i=1;i<=a;i++){
            if(i%2!=0){
                sum+=i;
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        int a=1;
        System.out.println(solve(a));
        System.out.println(improvisedApproch(a));
        System.out.println("_________");
        int b=4;
        System.out.println(solve(b));
        System.out.println(improvisedApproch(b));
        System.out.println("_________");
        int c=7;
        System.out.println(solve(c));
        System.out.println(improvisedApproch(c));
    }
}
