package lld1.LLD1.oneDarrays;

public class isPerfect {
    //you have to tell whether it is a perfect number or not.
    //A perfect number is a positive integer that is equal to the sum of its proper positive divisors
    // (excluding the number itself).
    //A positive proper divisor divides a number without leaving any remainder.
    //For the first test case A = 4, the answer is "NO" as sum of its proper divisors = 1 + 2 = 3, is not equal to 4.
    //For the second test case A = 6, the answer is "YES" as sum of its proper divisors = 1 + 2 + 3 = 6, is equal to 6.
//No number greater than a/2 can divide a (except a itself)
//Example:
//Take a = 12
//Divisors are:
//1, 2, 3, 4, 6, 12
    public static String solve(int a){
        int sum=0;
        for(int i=1;i<=a/2;i++){
            if(a%i==0){
               sum+=i;
            }
        }
        if (sum==a){
            return "yes";
        }
        return "NO";
    }

    public static String solveOptimized(int a) {
        if (a <= 1) return "NO"; // 1 is not perfect
//        Start sum = 1 because 1 is always a proper divisor.
//                Loop i from 2 to √a.
//                If i divides a, add both i and a/i to sum.
//                If a is a perfect square, don’t double-count √a.
//                Compare sum with a.
        int sum = 1; // 1 is always a proper divisor
        int sqrt = (int) Math.sqrt(a);
        System.out.print(sqrt+" ");

        for (int i = 2; i <= sqrt; i++) {
            if (a % i == 0) {
                sum += i;
                int other = a / i;
                if (other != i) { // avoid adding square root twice
                    sum += other;
                }
            }
        }

        return (sum == a) ? "YES" : "NO";
    }
    public static void main(String[] args) {
        int a=4;
        System.out.println(solve(a));
        System.out.println(solveOptimized(a));
        int b=6;
        System.out.println(solve(b));
        System.out.println(solveOptimized(b));
    }
}
