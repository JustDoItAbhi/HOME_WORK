package lld1.LLD1.oneDarrays;

public class CountFactors {
    //Take an integer N as input and print the count of its factors.
    //The factor of a number is the number that divides it perfectly leaving no remainder.
    //
    //Example: 1, 2, 3, and 6 are factors of 6
    public static int solve(int a){
        int count=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int a=5;
        System.out.println(solve(a));
        int b=10;
        System.out.println(solve(b));
    }
}
