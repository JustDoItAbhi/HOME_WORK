package lld1.DSA.oneDarrays;

public class Factors {
    //The factor of a number is the number that divides it perfectly leaving no remainder.
    //Example: 1, 2, 3, and 6 are factors of 6
    public static void solve(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        System.out.print(count+" ");
    }
    public static void optimizedWithLessThenOn(int n) {
        //Normal-words explanation of O(√n):
        //“Instead of checking all numbers up to n, we only check until the square root of n because every divisor
        // below √n has a matching divisor above √n. So we do much fewer checks — roughly the square root of n checks.”
        //If n = 1,000,000
        //Normal approach: check 1,000,000 numbers
        //√n approach: check only 1000 numbers
        int count = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i == n / i) {
                    count += 1; // perfect square divisor
                } else {
                    count += 2; // pair of divisors
                }
            }
        }
        System.out.print(count + " ");
    }
    public static void main(String[] args) {
        int c=5;
        solve(c);
        optimizedWithLessThenOn(c);
        System.out.println();
        int d=10;
        solve(d);
        optimizedWithLessThenOn(d);
        System.out.println();

        int a=12;
        solve(a);
        optimizedWithLessThenOn(a);
        System.out.println();
        int b=6;
        solve(b);
        optimizedWithLessThenOn(b);
    }
}
